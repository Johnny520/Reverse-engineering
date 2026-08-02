.class public abstract Lhd0;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Ls30;

.field public static final b:Lc80;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    new-instance v0, Ls30;

    .line 2
    .line 3
    const v1, 0x3ecccccd    # 0.4f

    .line 4
    .line 5
    .line 6
    const/4 v2, 0x0

    .line 7
    const v3, 0x3e4ccccd    # 0.2f

    .line 8
    .line 9
    .line 10
    const/high16 v4, 0x3f800000    # 1.0f

    .line 11
    .line 12
    invoke-direct {v0, v1, v2, v3, v4}, Ls30;-><init>(FFFF)V

    .line 13
    .line 14
    .line 15
    sput-object v0, Lhd0;->a:Ls30;

    .line 16
    .line 17
    new-instance v0, Ls30;

    .line 18
    .line 19
    invoke-direct {v0, v2, v2, v3, v4}, Ls30;-><init>(FFFF)V

    .line 20
    .line 21
    .line 22
    new-instance v0, Ls30;

    .line 23
    .line 24
    invoke-direct {v0, v1, v2, v4, v4}, Ls30;-><init>(FFFF)V

    .line 25
    .line 26
    .line 27
    new-instance v0, Lc80;

    .line 28
    .line 29
    const/4 v1, 0x4

    .line 30
    invoke-direct {v0, v1}, Lc80;-><init>(I)V

    .line 31
    .line 32
    .line 33
    sput-object v0, Lhd0;->b:Lc80;

    .line 34
    .line 35
    return-void
.end method
