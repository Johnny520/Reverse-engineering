package p265s1;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.RectF;
import p024b9.AbstractC1043k;
import p215oc.C5725t;
import p250r1.C6457g;
import p250r1.C6459i;
import p265s1.AbstractC7162x2;
import p265s1.InterfaceC7144t2;

/* JADX INFO: renamed from: s1.r0 */
/* JADX INFO: compiled from: r8-map-id-41ef8b4051cf12c4299b71f89f7150459dca1d84aebb9e505d81ecf50968f600 */
/* JADX INFO: loaded from: classes.dex */
public final class C7132r0 implements InterfaceC7144t2 {

    /* JADX INFO: renamed from: b */
    public final Path f23662b;

    /* JADX INFO: renamed from: c */
    public RectF f23663c;

    /* JADX INFO: renamed from: d */
    public float[] f23664d;

    /* JADX INFO: renamed from: e */
    public Matrix f23665e;

    public /* synthetic */ C7132r0(Path path, int i10, AbstractC1043k abstractC1043k) {
        this((i10 & 1) != 0 ? new Path() : path);
    }

    @Override // p265s1.InterfaceC7144t2
    /* JADX INFO: renamed from: a */
    public void mo28170a(float[] fArr) {
        if (this.f23665e == null) {
            this.f23665e = new Matrix();
        }
        Matrix matrix = this.f23665e;
        matrix.getClass();
        AbstractC7117o0.m28050a(matrix, fArr);
        Path path = this.f23662b;
        Matrix matrix2 = this.f23665e;
        matrix2.getClass();
        path.transform(matrix2);
    }

    @Override // p265s1.InterfaceC7144t2
    /* JADX INFO: renamed from: b */
    public void mo28171b(float f10, float f11, float f12, float f13) {
        this.f23662b.rQuadTo(f10, f11, f12, f13);
    }

    @Override // p265s1.InterfaceC7144t2
    /* JADX INFO: renamed from: c */
    public boolean mo28172c() {
        return this.f23662b.isConvex();
    }

    @Override // p265s1.InterfaceC7144t2
    public void close() {
        this.f23662b.close();
    }

    @Override // p265s1.InterfaceC7144t2
    /* JADX INFO: renamed from: d */
    public void mo28173d(InterfaceC7144t2 interfaceC7144t2, long j10) {
        Path path = this.f23662b;
        if (interfaceC7144t2 instanceof C7132r0) {
            path.addPath(((C7132r0) interfaceC7144t2).m28188v(), Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
        } else {
            C5725t.m23179a("Unable to obtain android.graphics.Path");
        }
    }

    @Override // p265s1.InterfaceC7144t2
    /* JADX INFO: renamed from: f */
    public void mo28174f(float f10, float f11) {
        this.f23662b.rMoveTo(f10, f11);
    }

    @Override // p265s1.InterfaceC7144t2
    /* JADX INFO: renamed from: g */
    public void mo28175g(C6457g c6457g, InterfaceC7144t2.b bVar) {
        m28189w(c6457g);
        if (this.f23663c == null) {
            this.f23663c = new RectF();
        }
        RectF rectF = this.f23663c;
        rectF.getClass();
        rectF.set(c6457g.m25583l(), c6457g.m25586o(), c6457g.m25584m(), c6457g.m25580i());
        Path path = this.f23662b;
        RectF rectF2 = this.f23663c;
        rectF2.getClass();
        path.addRect(rectF2, AbstractC7147u0.m28228e(bVar));
    }

    @Override // p265s1.InterfaceC7144t2
    public C6457g getBounds() {
        if (this.f23663c == null) {
            this.f23663c = new RectF();
        }
        RectF rectF = this.f23663c;
        rectF.getClass();
        this.f23662b.computeBounds(rectF, true);
        return new C6457g(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }

    @Override // p265s1.InterfaceC7144t2
    /* JADX INFO: renamed from: h */
    public void mo28176h(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f23662b.rCubicTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // p265s1.InterfaceC7144t2
    public boolean isEmpty() {
        return this.f23662b.isEmpty();
    }

    @Override // p265s1.InterfaceC7144t2
    /* JADX INFO: renamed from: j */
    public void mo28177j(int i10) {
        this.f23662b.setFillType(AbstractC7154v2.m28240d(i10, AbstractC7154v2.f23684a.m28242a()) ? Path.FillType.EVEN_ODD : Path.FillType.WINDING);
    }

    @Override // p265s1.InterfaceC7144t2
    /* JADX INFO: renamed from: k */
    public void mo28178k(float f10, float f11, float f12, float f13) {
        this.f23662b.quadTo(f10, f11, f12, f13);
    }

    @Override // p265s1.InterfaceC7144t2
    /* JADX INFO: renamed from: l */
    public int mo28179l() {
        return this.f23662b.getFillType() == Path.FillType.EVEN_ODD ? AbstractC7154v2.f23684a.m28242a() : AbstractC7154v2.f23684a.m28243b();
    }

    @Override // p265s1.InterfaceC7144t2
    /* JADX INFO: renamed from: m */
    public void mo28180m(float f10, float f11) {
        this.f23662b.moveTo(f10, f11);
    }

    @Override // p265s1.InterfaceC7144t2
    /* JADX INFO: renamed from: n */
    public void mo28181n(float f10, float f11, float f12, float f13, float f14, float f15) {
        this.f23662b.cubicTo(f10, f11, f12, f13, f14, f15);
    }

    @Override // p265s1.InterfaceC7144t2
    /* JADX INFO: renamed from: o */
    public boolean mo28182o(InterfaceC7144t2 interfaceC7144t2, InterfaceC7144t2 interfaceC7144t22, int i10) {
        AbstractC7162x2.a aVar = AbstractC7162x2.f23689a;
        Path.Op op = AbstractC7162x2.m28257f(i10, aVar.m28258a()) ? Path.Op.DIFFERENCE : AbstractC7162x2.m28257f(i10, aVar.m28259b()) ? Path.Op.INTERSECT : AbstractC7162x2.m28257f(i10, aVar.m28260c()) ? Path.Op.REVERSE_DIFFERENCE : AbstractC7162x2.m28257f(i10, aVar.m28261d()) ? Path.Op.UNION : Path.Op.XOR;
        Path path = this.f23662b;
        if (!(interfaceC7144t2 instanceof C7132r0)) {
            C5725t.m23179a("Unable to obtain android.graphics.Path");
            return false;
        }
        Path pathM28188v = ((C7132r0) interfaceC7144t2).m28188v();
        if (interfaceC7144t22 instanceof C7132r0) {
            return path.op(pathM28188v, ((C7132r0) interfaceC7144t22).m28188v(), op);
        }
        C5725t.m23179a("Unable to obtain android.graphics.Path");
        return false;
    }

    @Override // p265s1.InterfaceC7144t2
    /* JADX INFO: renamed from: p */
    public void mo28183p() {
        this.f23662b.rewind();
    }

    @Override // p265s1.InterfaceC7144t2
    /* JADX INFO: renamed from: q */
    public void mo28184q(long j10) {
        Matrix matrix = this.f23665e;
        if (matrix == null) {
            this.f23665e = new Matrix();
        } else {
            matrix.getClass();
            matrix.reset();
        }
        Matrix matrix2 = this.f23665e;
        matrix2.getClass();
        matrix2.setTranslate(Float.intBitsToFloat((int) (j10 >> 32)), Float.intBitsToFloat((int) (j10 & 4294967295L)));
        Path path = this.f23662b;
        Matrix matrix3 = this.f23665e;
        matrix3.getClass();
        path.transform(matrix3);
    }

    @Override // p265s1.InterfaceC7144t2
    /* JADX INFO: renamed from: r */
    public void mo28185r(float f10, float f11) {
        this.f23662b.rLineTo(f10, f11);
    }

    @Override // p265s1.InterfaceC7144t2
    public void reset() {
        this.f23662b.reset();
    }

    @Override // p265s1.InterfaceC7144t2
    /* JADX INFO: renamed from: s */
    public void mo28186s(float f10, float f11) {
        this.f23662b.lineTo(f10, f11);
    }

    @Override // p265s1.InterfaceC7144t2
    /* JADX INFO: renamed from: u */
    public void mo28187u(C6459i c6459i, InterfaceC7144t2.b bVar) {
        if (this.f23663c == null) {
            this.f23663c = new RectF();
        }
        RectF rectF = this.f23663c;
        rectF.getClass();
        rectF.set(c6459i.m25602e(), c6459i.m25604g(), c6459i.m25603f(), c6459i.m25598a());
        if (this.f23664d == null) {
            this.f23664d = new float[8];
        }
        float[] fArr = this.f23664d;
        fArr.getClass();
        fArr[0] = Float.intBitsToFloat((int) (c6459i.m25605h() >> 32));
        fArr[1] = Float.intBitsToFloat((int) (c6459i.m25605h() & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (c6459i.m25606i() >> 32));
        fArr[3] = Float.intBitsToFloat((int) (c6459i.m25606i() & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (c6459i.m25600c() >> 32));
        fArr[5] = Float.intBitsToFloat((int) (c6459i.m25600c() & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (c6459i.m25599b() >> 32));
        fArr[7] = Float.intBitsToFloat((int) (c6459i.m25599b() & 4294967295L));
        Path path = this.f23662b;
        RectF rectF2 = this.f23663c;
        rectF2.getClass();
        float[] fArr2 = this.f23664d;
        fArr2.getClass();
        path.addRoundRect(rectF2, fArr2, AbstractC7147u0.m28228e(bVar));
    }

    /* JADX INFO: renamed from: v */
    public final Path m28188v() {
        return this.f23662b;
    }

    /* JADX INFO: renamed from: w */
    public final void m28189w(C6457g c6457g) {
        if (Float.isNaN(c6457g.m25583l()) || Float.isNaN(c6457g.m25586o()) || Float.isNaN(c6457g.m25584m()) || Float.isNaN(c6457g.m25580i())) {
            AbstractC7147u0.m28227d("Invalid rectangle, make sure no value is NaN");
        }
    }

    public C7132r0(Path path) {
        this.f23662b = path;
    }
}
