package io.github.oshai.kotlinlogging.slf4j.internal;

import java.util.Iterator;
import kotlin.InterfaceC5168;
import kotlin.Metadata;
import net.bytebuddy.description.method.MethodDescription;
import org.slf4j.Marker;

/* JADX INFO: compiled from: r8-map-id-cb39a6809a634dd4ad3d163e22b2e3b526599fa3253f8854b17de2b335a1a776 */
/* JADX INFO: loaded from: classes2.dex */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010)\n\u0002\u0010(\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\b\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006H\u0096\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\f\u001a\u00020\u000b2\u000e\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\f\u0010\u0005J \u0010\u000e\u001a\u00020\r2\u000e\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00020\u0002H\u0096\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\rH\u0097\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\rH\u0096\u0001¢\u0006\u0004\b\u0012\u0010\u0011J4\u0010\u0015\u001a&\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002 \u0007*\u0012\u0012\f\u0012\n \u0007*\u0004\u0018\u00010\u00020\u0002\u0018\u00010\u00140\u0013H\u0096\u0003¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u0017\u001a\u00020\r2\u000e\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00020\u0002H\u0096\u0003¢\u0006\u0004\b\u0017\u0010\u000fJ \u0010\u0017\u001a\u00020\r2\u000e\u0010\n\u001a\n \u0007*\u0004\u0018\u00010\u00060\u0006H\u0096\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lio/github/oshai/kotlinlogging/slf4j/internal/Slf4jMarker;", "", "Lorg/slf4j/Marker;", "marker", MethodDescription.CONSTRUCTOR_INTERNAL_NAME, "(Lorg/slf4j/Marker;)V", "", "kotlin.jvm.PlatformType", "getName", "()Ljava/lang/String;", "p0", "Lkotlin/飘花落叶言子楪兰苏哲世;", "add", "", "remove", "(Lorg/slf4j/Marker;)Z", "hasChildren", "()Z", "hasReferences", "", "", "iterator", "()Ljava/util/Iterator;", "contains", "(Ljava/lang/String;)Z", "Lorg/slf4j/Marker;", "getMarker", "()Lorg/slf4j/Marker;", "kotlin-logging_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class Slf4jMarker implements Marker {
    private final Marker marker;

    public Slf4jMarker(Marker marker) {
        marker.getClass();
        this.marker = marker;
    }

    @Override // org.slf4j.Marker
    public void add(Marker p0) {
        this.marker.add(p0);
    }

    @Override // org.slf4j.Marker
    public boolean contains(String p0) {
        return this.marker.contains(p0);
    }

    public final Marker getMarker() {
        return this.marker;
    }

    @Override // org.slf4j.Marker
    public String getName() {
        return this.marker.getName();
    }

    @Override // org.slf4j.Marker
    @InterfaceC5168
    public boolean hasChildren() {
        return this.marker.hasChildren();
    }

    @Override // org.slf4j.Marker
    public boolean hasReferences() {
        return this.marker.hasReferences();
    }

    @Override // org.slf4j.Marker
    public Iterator<Marker> iterator() {
        return this.marker.iterator();
    }

    @Override // org.slf4j.Marker
    public boolean remove(Marker p0) {
        return this.marker.remove(p0);
    }

    @Override // org.slf4j.Marker
    public boolean contains(Marker p0) {
        return this.marker.contains(p0);
    }
}
