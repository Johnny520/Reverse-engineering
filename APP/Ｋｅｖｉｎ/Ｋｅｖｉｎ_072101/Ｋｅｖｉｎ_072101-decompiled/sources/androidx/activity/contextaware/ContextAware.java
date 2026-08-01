package androidx.activity.contextaware;

/* JADX INFO: loaded from: classes2.dex */
public interface ContextAware {
    void addOnContextAvailableListener(androidx.activity.contextaware.OnContextAvailableListener r1);

    android.content.Context peekAvailableContext();

    void removeOnContextAvailableListener(androidx.activity.contextaware.OnContextAvailableListener r1);
}
