.class public abstract Lp4;
.super Ljava/lang/Object;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# static fields
.field public static final a:Luh1;


# direct methods
.method static constructor <clinit>()V
    .locals 6

    .line 1
    new-instance v0, Low;

    .line 2
    .line 3
    const/4 v1, 0x1

    .line 4
    invoke-direct {v0, v1}, Low;-><init>(I)V

    .line 5
    .line 6
    .line 7
    invoke-static {v0}, Lfg1;->A(Lnn0;)Luh1;

    .line 8
    .line 9
    .line 10
    move-result-object v0

    .line 11
    new-instance v2, Lw;

    .line 12
    .line 13
    const/4 v3, 0x3

    .line 14
    invoke-direct {v2, v3}, Lw;-><init>(I)V

    .line 15
    .line 16
    .line 17
    invoke-static {v0, v1, v2}, Lnn2;->a(Luh1;ZLin0;)Luh1;

    .line 18
    .line 19
    .line 20
    move-result-object v0

    .line 21
    const/high16 v2, 0x41200000    # 10.0f

    .line 22
    .line 23
    const/4 v4, 0x0

    .line 24
    const/4 v5, 0x2

    .line 25
    invoke-static {v0, v2, v4, v5}, Lfg1;->E(Luh1;FFI)Luh1;

    .line 26
    .line 27
    .line 28
    new-instance v0, Low;

    .line 29
    .line 30
    invoke-direct {v0, v5}, Low;-><init>(I)V

    .line 31
    .line 32
    .line 33
    invoke-static {v0}, Lfg1;->A(Lnn0;)Luh1;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    new-instance v5, Lw;

    .line 38
    .line 39
    invoke-direct {v5, v3}, Lw;-><init>(I)V

    .line 40
    .line 41
    .line 42
    invoke-static {v0, v1, v5}, Lnn2;->a(Luh1;ZLin0;)Luh1;

    .line 43
    .line 44
    .line 45
    move-result-object v0

    .line 46
    invoke-static {v0, v4, v2, v1}, Lfg1;->E(Luh1;FFI)Luh1;

    .line 47
    .line 48
    .line 49
    move-result-object v0

    .line 50
    sput-object v0, Lp4;->a:Luh1;

    .line 51
    .line 52
    return-void
.end method
