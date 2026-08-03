package Yue;

import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.RegionIterator;
import java.util.Iterator;

/* JADX INFO: renamed from: Yue.ۥۡۦۣۦ, reason: contains not printable characters */
/* JADX INFO: loaded from: classes.dex */
@InterfaceC7507({"SMAP\nRegion.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n*L\n1#1,158:1\n71#1,3:159\n35#1,3:162\n44#1,3:165\n*S KotlinDebug\n*F\n+ 1 Region.kt\nandroidx/core/graphics/RegionKt\n*L\n79#1:159,3\n84#1:162,3\n89#1:165,3\n*E\n"})
public final class C7084 {

    /* JADX INFO: renamed from: Yue.ۥۡۦۣۦ$ۥ */
    public static final class C1160 implements Iterator<Rect>, InterfaceC5591 {

        /* JADX INFO: renamed from: ۥۣ۟۟۠, reason: contains not printable characters */
        @InterfaceC6399
        public final RegionIterator f21401;

        /* JADX INFO: renamed from: ۥ۟۟۠ۤ, reason: contains not printable characters */
        @InterfaceC6399
        public final Rect f21402;

        /* JADX INFO: renamed from: ۥ۟۟۠ۥ, reason: contains not printable characters */
        public boolean f21403;

        public C1160(Region region) {
            RegionIterator regionIterator = new RegionIterator(region);
            this.f21401 = regionIterator;
            Rect rect = new Rect();
            this.f21402 = rect;
            this.f21403 = regionIterator.next(rect);
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.f21403;
        }

        @Override // java.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        /* JADX DEBUG: Method merged with bridge method: next()Ljava/lang/Object; */
        @Override // java.util.Iterator
        @InterfaceC6399
        /* JADX INFO: renamed from: ۥ, reason: merged with bridge method [inline-methods] */
        public Rect next() {
            if (!this.f21403) {
                throw new IndexOutOfBoundsException();
            }
            Rect rect = new Rect(this.f21402);
            this.f21403 = this.f21401.next(this.f21402);
            return rect;
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ */
    public static final Region m3368(@InterfaceC6399 Region region, @InterfaceC6399 Rect rect) {
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.INTERSECT);
        return region2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟ */
    public static final Region m3369(@InterfaceC6399 Region region, @InterfaceC6399 Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.INTERSECT);
        return region3;
    }

    /* JADX INFO: renamed from: ۥ۟۟, reason: contains not printable characters */
    public static final boolean m22083(@InterfaceC6399 Region region, @InterfaceC6399 Point point) {
        return region.contains(point.x, point.y);
    }

    /* JADX INFO: renamed from: ۥ۟۟۟, reason: contains not printable characters */
    public static final void m22084(@InterfaceC6399 Region region, @InterfaceC6399 InterfaceC5124<? super Rect, C8107> interfaceC5124) {
        RegionIterator regionIterator = new RegionIterator(region);
        while (true) {
            Rect rect = new Rect();
            if (!regionIterator.next(rect)) {
                return;
            } else {
                interfaceC5124.invoke(rect);
            }
        }
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۟, reason: contains not printable characters */
    public static final Iterator<Rect> m22085(@InterfaceC6399 Region region) {
        return new C1160(region);
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟۠, reason: contains not printable characters */
    public static final Region m22086(@InterfaceC6399 Region region, @InterfaceC6399 Rect rect) {
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.DIFFERENCE);
        return region2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۡ, reason: contains not printable characters */
    public static final Region m22087(@InterfaceC6399 Region region, @InterfaceC6399 Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.DIFFERENCE);
        return region3;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۢ, reason: contains not printable characters */
    public static final Region m22088(@InterfaceC6399 Region region) {
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥۣ۟۟۟, reason: contains not printable characters */
    public static final Region m22089(@InterfaceC6399 Region region, @InterfaceC6399 Rect rect) {
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۤ, reason: contains not printable characters */
    public static final Region m22090(@InterfaceC6399 Region region, @InterfaceC6399 Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۥ, reason: contains not printable characters */
    public static final Region m22091(@InterfaceC6399 Region region, @InterfaceC6399 Rect rect) {
        Region region2 = new Region(region);
        region2.union(rect);
        return region2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۦ, reason: contains not printable characters */
    public static final Region m22092(@InterfaceC6399 Region region, @InterfaceC6399 Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.UNION);
        return region3;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۧ, reason: contains not printable characters */
    public static final Region m22093(@InterfaceC6399 Region region) {
        Region region2 = new Region(region.getBounds());
        region2.op(region, Region.Op.DIFFERENCE);
        return region2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۟ۨ, reason: contains not printable characters */
    public static final Region m22094(@InterfaceC6399 Region region, @InterfaceC6399 Rect rect) {
        Region region2 = new Region(region);
        region2.op(rect, Region.Op.XOR);
        return region2;
    }

    @InterfaceC6399
    /* JADX INFO: renamed from: ۥ۟۟۠, reason: contains not printable characters */
    public static final Region m22095(@InterfaceC6399 Region region, @InterfaceC6399 Region region2) {
        Region region3 = new Region(region);
        region3.op(region2, Region.Op.XOR);
        return region3;
    }
}
