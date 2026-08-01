package p204o1;

import android.view.DragEvent;
import android.view.View;
import java.util.Iterator;
import kotlin.Metadata;
import okhttp3.internal.url._UrlKt;
import p010a9.InterfaceC0189q;
import p117i.C3042c;
import p165l1.InterfaceC4507m;
import p166l2.AbstractC4606z0;

/* JADX INFO: renamed from: o1.a */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnDragListenerC5619a implements View.OnDragListener, InterfaceC5622d {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0189q f17597a;

    /* JADX INFO: renamed from: b */
    public final C5623e f17598b = new C5623e(null, null, 3, null);

    /* JADX INFO: renamed from: c */
    public final C3042c f17599c = new C3042c(0, 1, null);

    /* JADX INFO: renamed from: d */
    public final InterfaceC4507m f17600d = new a();

    public ViewOnDragListenerC5619a(InterfaceC0189q interfaceC0189q) {
        this.f17597a = interfaceC0189q;
    }

    @Override // p204o1.InterfaceC5622d
    /* JADX INFO: renamed from: a */
    public void mo22762a(InterfaceC5625g interfaceC5625g) {
        this.f17599c.add(interfaceC5625g);
    }

    @Override // p204o1.InterfaceC5622d
    /* JADX INFO: renamed from: b */
    public boolean mo22763b(InterfaceC5625g interfaceC5625g) {
        return this.f17599c.contains(interfaceC5625g);
    }

    /* JADX INFO: renamed from: d */
    public InterfaceC4507m m22764d() {
        return this.f17600d;
    }

    @Override // android.view.View.OnDragListener
    public boolean onDrag(View view, DragEvent dragEvent) {
        C5621c c5621c = new C5621c(dragEvent);
        switch (dragEvent.getAction()) {
            case 1:
                boolean zM22774G2 = this.f17598b.m22774G2(c5621c);
                Iterator<E> it = this.f17599c.iterator();
                while (it.hasNext()) {
                    ((InterfaceC5625g) it.next()).mo22780s0(c5621c);
                }
                break;
            case 2:
                this.f17598b.mo22781v1(c5621c);
                break;
            case 4:
                this.f17598b.mo22773B1(c5621c);
                this.f17599c.clear();
                break;
            case 5:
                this.f17598b.mo22777T0(c5621c);
                break;
            case 6:
                this.f17598b.mo22778k1(c5621c);
                break;
        }
        return false;
    }

    /* JADX INFO: renamed from: o1.a$a */
    /* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
    @Metadata(m16757d1 = {"\u0000/\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u000f\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0011"}, m16758d2 = {"o1/a$a", "Ll2/z0;", "Lo1/e;", "m", "()Lo1/e;", "node", "Ll8/i0;", "n", "(Lo1/e;)V", _UrlKt.FRAGMENT_ENCODE_SET, "hashCode", "()I", _UrlKt.FRAGMENT_ENCODE_SET, "other", _UrlKt.FRAGMENT_ENCODE_SET, "equals", "(Ljava/lang/Object;)Z", "ui"}, m16759k = 1, m16760mv = {2, 0, 0}, m16762xi = 48)
    public static final class a extends AbstractC4606z0 {
        public a() {
        }

        public boolean equals(Object other) {
            return other == this;
        }

        public int hashCode() {
            return ViewOnDragListenerC5619a.this.f17598b.hashCode();
        }

        @Override // p166l2.AbstractC4606z0
        /* JADX INFO: renamed from: m, reason: merged with bridge method [inline-methods] */
        public C5623e mo1191j() {
            return ViewOnDragListenerC5619a.this.f17598b;
        }

        @Override // p166l2.AbstractC4606z0
        /* JADX INFO: renamed from: n, reason: merged with bridge method [inline-methods] */
        public void mo1192k(C5623e node) {
        }
    }
}
