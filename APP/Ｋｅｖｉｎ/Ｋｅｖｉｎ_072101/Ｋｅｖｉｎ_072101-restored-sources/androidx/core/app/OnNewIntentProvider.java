package androidx.core.app;

/* JADX INFO: loaded from: classes2.dex */
public interface OnNewIntentProvider {
    void addOnNewIntentListener(androidx.core.util.Consumer<android.content.Intent> r1);

    void removeOnNewIntentListener(androidx.core.util.Consumer<android.content.Intent> r1);
}
