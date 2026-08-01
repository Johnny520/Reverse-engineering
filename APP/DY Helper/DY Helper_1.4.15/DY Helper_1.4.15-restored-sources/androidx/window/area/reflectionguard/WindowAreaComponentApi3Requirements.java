package androidx.window.area.reflectionguard;

/* JADX INFO: compiled from: r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee */
/* JADX INFO: loaded from: classes.dex */
public interface WindowAreaComponentApi3Requirements {
    void addRearDisplayPresentationStatusListener(androidx.window.extensions.core.util.function.Consumer<androidx.window.extensions.area.ExtensionWindowAreaStatus> r1);

    void addRearDisplayStatusListener(androidx.window.extensions.core.util.function.Consumer<java.lang.Integer> r1);

    void endRearDisplayPresentationSession();

    void endRearDisplaySession();

    android.util.DisplayMetrics getRearDisplayMetrics();

    androidx.window.extensions.area.ExtensionWindowAreaPresentation getRearDisplayPresentation();

    void removeRearDisplayPresentationStatusListener(androidx.window.extensions.core.util.function.Consumer<androidx.window.extensions.area.ExtensionWindowAreaStatus> r1);

    void removeRearDisplayStatusListener(androidx.window.extensions.core.util.function.Consumer<java.lang.Integer> r1);

    void startRearDisplayPresentationSession(android.app.Activity r1, androidx.window.extensions.core.util.function.Consumer<java.lang.Integer> r2);

    void startRearDisplaySession(android.app.Activity r1, androidx.window.extensions.core.util.function.Consumer<java.lang.Integer> r2);
}
