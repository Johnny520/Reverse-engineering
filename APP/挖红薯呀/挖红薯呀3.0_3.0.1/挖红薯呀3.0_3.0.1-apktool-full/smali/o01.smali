.class public final Lo01;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Liu;


# instance fields
.field public final d:Ln01;


# direct methods
.method public constructor <init>(Ln01;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lo01;->d:Ln01;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final f(Ljava/lang/Object;Lik;)Ljava/lang/Object;
    .locals 0

    .line 1
    iget-object p0, p0, Lo01;->d:Ln01;

    .line 2
    .line 3
    invoke-interface {p0, p2, p1}, Ln01;->c(Lik;Ljava/lang/Object;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    sget-object p1, Lzk;->d:Lzk;

    .line 8
    .line 9
    if-ne p0, p1, :cond_0

    .line 10
    .line 11
    return-object p0

    .line 12
    :cond_0
    sget-object p0, Lna1;->a:Lna1;

    .line 13
    .line 14
    return-object p0
.end method
