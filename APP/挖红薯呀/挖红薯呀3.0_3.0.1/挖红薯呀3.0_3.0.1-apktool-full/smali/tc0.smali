.class public final synthetic Ltc0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lyw;


# instance fields
.field public final synthetic d:Llf1;

.field public final synthetic e:Z

.field public final synthetic f:Lsw;

.field public final synthetic g:Z


# direct methods
.method public synthetic constructor <init>(Llf1;ZLsw;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ltc0;->d:Llf1;

    .line 5
    .line 6
    iput-boolean p2, p0, Ltc0;->e:Z

    .line 7
    .line 8
    iput-object p3, p0, Ltc0;->f:Lsw;

    .line 9
    .line 10
    iput-boolean p4, p0, Ltc0;->g:Z

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 8

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, Lao0;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result v5

    .line 10
    move-object v6, p3

    .line 11
    check-cast v6, Lji;

    .line 12
    .line 13
    check-cast p4, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v7

    .line 19
    iget-object v0, p0, Ltc0;->d:Llf1;

    .line 20
    .line 21
    iget-boolean v1, p0, Ltc0;->e:Z

    .line 22
    .line 23
    iget-object v2, p0, Ltc0;->f:Lsw;

    .line 24
    .line 25
    iget-boolean v3, p0, Ltc0;->g:Z

    .line 26
    .line 27
    invoke-static/range {v0 .. v7}, Lzc0;->L(Llf1;ZLsw;ZLao0;ILji;I)Lna1;

    .line 28
    .line 29
    .line 30
    move-result-object p0

    .line 31
    return-object p0
.end method
