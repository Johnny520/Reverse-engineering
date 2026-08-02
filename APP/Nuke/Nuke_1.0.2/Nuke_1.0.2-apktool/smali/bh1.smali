.class public final Lbh1;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static h:Lbh1;


# instance fields
.field public final a:Ld61;

.field public final b:Lm13;

.field public final c:Lh70;

.field public final d:Lxl0;

.field public final e:Lm13;

.field public f:F

.field public g:F


# direct methods
.method public constructor <init>(Ld61;Lm13;Lh70;Lxl0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lbh1;->a:Ld61;

    .line 5
    .line 6
    iput-object p2, p0, Lbh1;->b:Lm13;

    .line 7
    .line 8
    iput-object p3, p0, Lbh1;->c:Lh70;

    .line 9
    .line 10
    iput-object p4, p0, Lbh1;->d:Lxl0;

    .line 11
    .line 12
    invoke-static {p2, p1}, Lxe1;->k0(Lm13;Ld61;)Lm13;

    .line 13
    .line 14
    .line 15
    move-result-object p1

    .line 16
    iput-object p1, p0, Lbh1;->e:Lm13;

    .line 17
    .line 18
    const/high16 p1, 0x7fc00000    # Float.NaN

    .line 19
    .line 20
    iput p1, p0, Lbh1;->f:F

    .line 21
    .line 22
    iput p1, p0, Lbh1;->g:F

    .line 23
    .line 24
    return-void
.end method
