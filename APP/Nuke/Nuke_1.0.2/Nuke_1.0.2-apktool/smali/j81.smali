.class public final Lj81;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# instance fields
.field public final a:La91;

.field public final b:Lb5;

.field public c:Lf90;

.field public d:I

.field public e:I

.field public f:I


# direct methods
.method public constructor <init>(La91;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    new-instance v0, Lb5;

    .line 5
    .line 6
    const/16 v1, 0x19

    .line 7
    .line 8
    invoke-direct {v0, v1}, Lb5;-><init>(I)V

    .line 9
    .line 10
    .line 11
    iput-object v0, p0, Lj81;->b:Lb5;

    .line 12
    .line 13
    const/4 v0, -0x1

    .line 14
    iput v0, p0, Lj81;->d:I

    .line 15
    .line 16
    iput v0, p0, Lj81;->e:I

    .line 17
    .line 18
    iput-object p1, p0, Lj81;->a:La91;

    .line 19
    .line 20
    return-void
.end method
