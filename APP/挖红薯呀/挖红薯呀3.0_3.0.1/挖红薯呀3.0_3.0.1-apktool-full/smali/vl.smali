.class public final Lvl;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lyt;


# instance fields
.field public a:Lml;

.field public final b:Lco;


# direct methods
.method public constructor <init>(Lml;)V
    .locals 1

    .line 1
    sget-object v0, Lwy0;->c:Lco;

    .line 2
    .line 3
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    iput-object p1, p0, Lvl;->a:Lml;

    .line 7
    .line 8
    iput-object v0, p0, Lvl;->b:Lco;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final a(Lhz0;FLik;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lul;

    .line 2
    .line 3
    const/4 v1, 0x0

    .line 4
    invoke-direct {v0, p2, p0, p1, v1}, Lul;-><init>(FLvl;Lhz0;Lik;)V

    .line 5
    .line 6
    .line 7
    check-cast p3, Ljk;

    .line 8
    .line 9
    iget-object p0, p0, Lvl;->b:Lco;

    .line 10
    .line 11
    invoke-static {p0, v0, p3}, Li4;->H(Lpk;Lww;Ljk;)Ljava/lang/Object;

    .line 12
    .line 13
    .line 14
    move-result-object p0

    .line 15
    return-object p0
.end method
