.class public final synthetic Lvx0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:Lpe0;

.field public final synthetic e:Lww;

.field public final synthetic f:Lmh;

.field public final synthetic g:Lww;

.field public final synthetic h:Lww;

.field public final synthetic i:I

.field public final synthetic j:J

.field public final synthetic k:J

.field public final synthetic l:Lfd1;

.field public final synthetic m:Lmh;


# direct methods
.method public synthetic constructor <init>(Lpe0;Lww;Lmh;Lww;Lww;IJJLfd1;Lmh;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lvx0;->d:Lpe0;

    .line 5
    .line 6
    iput-object p2, p0, Lvx0;->e:Lww;

    .line 7
    .line 8
    iput-object p3, p0, Lvx0;->f:Lmh;

    .line 9
    .line 10
    iput-object p4, p0, Lvx0;->g:Lww;

    .line 11
    .line 12
    iput-object p5, p0, Lvx0;->h:Lww;

    .line 13
    .line 14
    iput p6, p0, Lvx0;->i:I

    .line 15
    .line 16
    iput-wide p7, p0, Lvx0;->j:J

    .line 17
    .line 18
    iput-wide p9, p0, Lvx0;->k:J

    .line 19
    .line 20
    iput-object p11, p0, Lvx0;->l:Lfd1;

    .line 21
    .line 22
    iput-object p12, p0, Lvx0;->m:Lmh;

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 14

    .line 1
    move-object v12, p1

    .line 2
    check-cast v12, Lji;

    .line 3
    .line 4
    move-object/from16 v0, p2

    .line 5
    .line 6
    check-cast v0, Ljava/lang/Integer;

    .line 7
    .line 8
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 9
    .line 10
    .line 11
    const v0, 0x30000181

    .line 12
    .line 13
    .line 14
    invoke-static {v0}, Lj50;->A(I)I

    .line 15
    .line 16
    .line 17
    move-result v13

    .line 18
    iget-object v0, p0, Lvx0;->d:Lpe0;

    .line 19
    .line 20
    iget-object v1, p0, Lvx0;->e:Lww;

    .line 21
    .line 22
    iget-object v2, p0, Lvx0;->f:Lmh;

    .line 23
    .line 24
    iget-object v3, p0, Lvx0;->g:Lww;

    .line 25
    .line 26
    iget-object v4, p0, Lvx0;->h:Lww;

    .line 27
    .line 28
    iget v5, p0, Lvx0;->i:I

    .line 29
    .line 30
    iget-wide v6, p0, Lvx0;->j:J

    .line 31
    .line 32
    iget-wide v8, p0, Lvx0;->k:J

    .line 33
    .line 34
    iget-object v10, p0, Lvx0;->l:Lfd1;

    .line 35
    .line 36
    iget-object v11, p0, Lvx0;->m:Lmh;

    .line 37
    .line 38
    invoke-static/range {v0 .. v13}, Lz60;->b(Lpe0;Lww;Lmh;Lww;Lww;IJJLfd1;Lmh;Lji;I)V

    .line 39
    .line 40
    .line 41
    sget-object p0, Lna1;->a:Lna1;

    .line 42
    .line 43
    return-object p0
.end method
