/**
 * generated by Xtext 2.10.0
 */
package org.eclipse.january.geometry.dsl;

import org.eclipse.january.geometry.dsl.MTLStandaloneSetupGenerated;

/**
 * Initialization support for running Xtext languages without Equinox extension registry.
 */
@SuppressWarnings("all")
public class MTLStandaloneSetup extends MTLStandaloneSetupGenerated {
  public static void doSetup() {
    new MTLStandaloneSetup().createInjectorAndDoEMFRegistration();
  }
}
