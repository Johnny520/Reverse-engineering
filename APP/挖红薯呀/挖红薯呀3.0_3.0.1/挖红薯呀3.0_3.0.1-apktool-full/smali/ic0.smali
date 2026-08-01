.class public final synthetic Lic0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lxw;


# instance fields
.field public final synthetic d:I

.field public final synthetic e:Lwg0;

.field public final synthetic f:Llf1;

.field public final synthetic g:Z

.field public final synthetic h:Lsw;

.field public final synthetic i:Z


# direct methods
.method public synthetic constructor <init>(ILwg0;Llf1;ZLsw;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lic0;->d:I

    .line 5
    .line 6
    iput-object p2, p0, Lic0;->e:Lwg0;

    .line 7
    .line 8
    iput-object p3, p0, Lic0;->f:Llf1;

    .line 9
    .line 10
    iput-boolean p4, p0, Lic0;->g:Z

    .line 11
    .line 12
    iput-object p5, p0, Lic0;->h:Lsw;

    .line 13
    .line 14
    iput-boolean p6, p0, Lic0;->i:Z

    .line 15
    .line 16
    return-void
.end method


# virtual methods
.method public final a(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v6, p1

    .line 2
    check-cast v6, Ljn0;

    .line 3
    .line 4
    move-object v7, p2

    .line 5
    check-cast v7, Lji;

    .line 6
    .line 7
    check-cast p3, Ljava/lang/Integer;

    .line 8
    .line 9
    invoke-virtual {p3}, Ljava/lang/Integer;->intValue()I

    .line 10
    .line 11
    .line 12
    move-result v8

    .line 13
    iget v0, p0, Lic0;->d:I

    .line 14
    .line 15
    iget-object v1, p0, Lic0;->e:Lwg0;

    .line 16
    .line 17
    iget-object v2, p0, Lic0;->f:Llf1;

    .line 18
    .line 19
    iget-boolean v3, p0, Lic0;->g:Z

    .line 20
    .line 21
    iget-object v4, p0, Lic0;->h:Lsw;

    .line 22
    .line 23
    iget-boolean v5, p0, Lic0;->i:Z

    .line 24
    .line 25
    invoke-static/range {v0 .. v8}, Lzc0;->l(ILwg0;Llf1;ZLsw;ZLjn0;Lji;I)Lna1;

    .line 26
    .line 27
    .line 28
    move-result-object p0

    .line 29
    return-object p0
.end method
