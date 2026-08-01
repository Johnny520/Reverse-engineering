.class public final Lkm;
.super Llo0;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"


# static fields
.field public static final J:Ld;


# instance fields
.field public final I:Lgp0;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    .line 1
    new-instance v0, Ls8;

    .line 2
    .line 3
    const/16 v1, 0xd

    .line 4
    .line 5
    invoke-direct {v0, v1}, Ls8;-><init>(I)V

    .line 6
    .line 7
    .line 8
    new-instance v1, Lw9;

    .line 9
    .line 10
    const/16 v2, 0x9

    .line 11
    .line 12
    invoke-direct {v1, v2}, Lw9;-><init>(I)V

    .line 13
    .line 14
    .line 15
    new-instance v2, Lya;

    .line 16
    .line 17
    const/4 v3, 0x2

    .line 18
    invoke-direct {v2, v3, v0}, Lya;-><init>(ILjava/lang/Object;)V

    .line 19
    .line 20
    .line 21
    const/4 v0, 0x1

    .line 22
    invoke-static {v0, v1}, Ls91;->m(ILjava/lang/Object;)V

    .line 23
    .line 24
    .line 25
    new-instance v0, Ld;

    .line 26
    .line 27
    const/16 v3, 0x13

    .line 28
    .line 29
    invoke-direct {v0, v3, v2, v1}, Ld;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    .line 30
    .line 31
    .line 32
    sput-object v0, Lkm;->J:Ld;

    .line 33
    .line 34
    return-void
.end method

.method public constructor <init>(IFLhw;)V
    .locals 0

    .line 1
    invoke-direct {p0, p2, p1}, Llo0;-><init>(FI)V

    .line 2
    .line 3
    .line 4
    invoke-static {p3}, Lr60;->u(Ljava/lang/Object;)Lgp0;

    .line 5
    .line 6
    .line 7
    move-result-object p1

    .line 8
    iput-object p1, p0, Lkm;->I:Lgp0;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final n()I
    .locals 0

    .line 1
    iget-object p0, p0, Lkm;->I:Lgp0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lgp0;->getValue()Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    check-cast p0, Lhw;

    .line 8
    .line 9
    invoke-interface {p0}, Lhw;->invoke()Ljava/lang/Object;

    .line 10
    .line 11
    .line 12
    move-result-object p0

    .line 13
    check-cast p0, Ljava/lang/Number;

    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result p0

    .line 19
    return p0
.end method
