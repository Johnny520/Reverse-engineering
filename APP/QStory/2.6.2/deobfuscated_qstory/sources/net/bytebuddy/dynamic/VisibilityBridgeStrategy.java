package net.bytebuddy.dynamic;

import net.bytebuddy.description.method.MethodDescription;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
public interface VisibilityBridgeStrategy {

    /* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
    public enum Default implements VisibilityBridgeStrategy {
        ALWAYS { // from class: net.bytebuddy.dynamic.VisibilityBridgeStrategy.Default.1
            @Override // net.bytebuddy.dynamic.VisibilityBridgeStrategy
            public boolean generateVisibilityBridge(MethodDescription methodDescription) {
                return true;
            }
        },
        ON_NON_GENERIC_METHOD { // from class: net.bytebuddy.dynamic.VisibilityBridgeStrategy.Default.2
            @Override // net.bytebuddy.dynamic.VisibilityBridgeStrategy
            public boolean generateVisibilityBridge(MethodDescription methodDescription) {
                return !methodDescription.isGenerified();
            }
        },
        NEVER { // from class: net.bytebuddy.dynamic.VisibilityBridgeStrategy.Default.3
            @Override // net.bytebuddy.dynamic.VisibilityBridgeStrategy
            public boolean generateVisibilityBridge(MethodDescription methodDescription) {
                return false;
            }
        }
    }

    boolean generateVisibilityBridge(MethodDescription methodDescription);
}
