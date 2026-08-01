.class public final synthetic Ljc0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:Llf1;

.field public final synthetic e:Z

.field public final synthetic f:Lsw;

.field public final synthetic g:Lpe0;

.field public final synthetic h:I

.field public final synthetic i:Z

.field public final synthetic j:I

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(Llf1;ZLsw;Lpe0;IZII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ljc0;->d:Llf1;

    .line 5
    .line 6
    iput-boolean p2, p0, Ljc0;->e:Z

    .line 7
    .line 8
    iput-object p3, p0, Ljc0;->f:Lsw;

    .line 9
    .line 10
    iput-object p4, p0, Ljc0;->g:Lpe0;

    .line 11
    .line 12
    iput p5, p0, Ljc0;->h:I

    .line 13
    .line 14
    iput-boolean p6, p0, Ljc0;->i:Z

    .line 15
    .line 16
    iput p7, p0, Ljc0;->j:I

    .line 17
    .line 18
    iput p8, p0, Ljc0;->k:I

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 10

    .line 1
    move-object v8, p1

    .line 2
    check-cast v8, Lji;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result v9

    .line 10
    iget-object v0, p0, Ljc0;->d:Llf1;

    .line 11
    .line 12
    iget-boolean v1, p0, Ljc0;->e:Z

    .line 13
    .line 14
    iget-object v2, p0, Ljc0;->f:Lsw;

    .line 15
    .line 16
    iget-object v3, p0, Ljc0;->g:Lpe0;

    .line 17
    .line 18
    iget v4, p0, Ljc0;->h:I

    .line 19
    .line 20
    iget-boolean v5, p0, Ljc0;->i:Z

    .line 21
    .line 22
    iget v6, p0, Ljc0;->j:I

    .line 23
    .line 24
    iget v7, p0, Ljc0;->k:I

    .line 25
    .line 26
    invoke-static/range {v0 .. v9}, Lzc0;->N(Llf1;ZLsw;Lpe0;IZIILji;I)Lna1;

    .line 27
    .line 28
    .line 29
    move-result-object p0

    .line 30
    return-object p0
.end method
