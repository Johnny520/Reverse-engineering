.class public abstract Le10;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Lhx2;

.field public static final b:Lhx2;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    new-instance v0, Ldy;

    .line 2
    .line 3
    const/16 v1, 0x8

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ldy;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lhx2;

    .line 9
    .line 10
    invoke-direct {v1, v0}, Lhx2;-><init>(Lxm0;)V

    .line 11
    .line 12
    .line 13
    sput-object v1, Le10;->a:Lhx2;

    .line 14
    .line 15
    new-instance v0, Ldy;

    .line 16
    .line 17
    const/16 v1, 0x9

    .line 18
    .line 19
    invoke-direct {v0, v1}, Ldy;-><init>(I)V

    .line 20
    .line 21
    .line 22
    new-instance v1, Lhx2;

    .line 23
    .line 24
    invoke-direct {v1, v0}, Lhx2;-><init>(Lxm0;)V

    .line 25
    .line 26
    .line 27
    sput-object v1, Le10;->b:Lhx2;

    .line 28
    .line 29
    return-void
.end method
