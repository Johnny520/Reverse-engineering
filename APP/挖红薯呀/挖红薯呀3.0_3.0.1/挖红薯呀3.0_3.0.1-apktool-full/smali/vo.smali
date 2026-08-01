.class public final Lvo;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lhu;


# instance fields
.field public final d:Lhu;


# direct methods
.method public constructor <init>(Lhu;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvo;->d:Lhu;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final b(Liu;Lik;)Ljava/lang/Object;
    .locals 2

    .line 1
    new-instance v0, Lzt0;

    .line 2
    .line 3
    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    .line 4
    .line 5
    .line 6
    sget-object v1, Lo30;->l:Lzr;

    .line 7
    .line 8
    iput-object v1, v0, Lzt0;->d:Ljava/lang/Object;

    .line 9
    .line 10
    new-instance v1, Luo;

    .line 11
    .line 12
    invoke-direct {v1, p0, v0, p1}, Luo;-><init>(Lvo;Lzt0;Liu;)V

    .line 13
    .line 14
    .line 15
    iget-object p0, p0, Lvo;->d:Lhu;

    .line 16
    .line 17
    invoke-interface {p0, v1, p2}, Lhu;->b(Liu;Lik;)Ljava/lang/Object;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    sget-object p1, Lzk;->d:Lzk;

    .line 22
    .line 23
    if-ne p0, p1, :cond_0

    .line 24
    .line 25
    return-object p0

    .line 26
    :cond_0
    sget-object p0, Lna1;->a:Lna1;

    .line 27
    .line 28
    return-object p0
.end method
