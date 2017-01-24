/*
 * generated by Xtext 2.10.0
 */
package org.eclipse.january.geometry.dsl.tests

import com.google.inject.Inject
import org.eclipse.january.geometry.Geometry
import org.eclipse.xtext.junit4.InjectWith
import org.eclipse.xtext.junit4.XtextRunner
import org.eclipse.xtext.junit4.util.ParseHelper
import org.junit.Assert
import org.junit.Test
import org.junit.runner.RunWith
import org.eclipse.january.geometry.dsl.vtk.tests.VTKInjectorProvider

@RunWith(XtextRunner)
@InjectWith(VTKInjectorProvider)
class VTKParsingTest{

	@Inject
	ParseHelper<Geometry> parseHelper

	@Test 
	def void loadModel() {
		val result = parseHelper.parse('''
			Hello Xtext!
		''')
		Assert.assertNotNull(result)
	}

}
