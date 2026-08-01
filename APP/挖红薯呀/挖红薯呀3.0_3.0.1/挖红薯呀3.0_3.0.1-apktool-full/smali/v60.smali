.class public final synthetic Lv60;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:Lpe0;

.field public final synthetic e:Lc90;

.field public final synthetic f:Ljn0;

.field public final synthetic g:Lu8;

.field public final synthetic h:Lga;

.field public final synthetic i:Lyt;

.field public final synthetic j:Lj5;

.field public final synthetic k:Lsw;


# direct methods
.method public synthetic constructor <init>(Lpe0;Lc90;Ljn0;Lu8;Lga;Lyt;Lj5;Lsw;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lv60;->d:Lpe0;

    .line 5
    .line 6
    iput-object p2, p0, Lv60;->e:Lc90;

    .line 7
    .line 8
    iput-object p3, p0, Lv60;->f:Ljn0;

    .line 9
    .line 10
    iput-object p4, p0, Lv60;->g:Lu8;

    .line 11
    .line 12
    iput-object p5, p0, Lv60;->h:Lga;

    .line 13
    .line 14
    iput-object p6, p0, Lv60;->i:Lyt;

    .line 15
    .line 16
    iput-object p7, p0, Lv60;->j:Lj5;

    .line 17
    .line 18
    iput-object p8, p0, Lv60;->k:Lsw;

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
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const p1, 0xc00007

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lj50;->A(I)I

    .line 13
    .line 14
    .line 15
    move-result v9

    .line 16
    iget-object v0, p0, Lv60;->d:Lpe0;

    .line 17
    .line 18
    iget-object v1, p0, Lv60;->e:Lc90;

    .line 19
    .line 20
    iget-object v2, p0, Lv60;->f:Ljn0;

    .line 21
    .line 22
    iget-object v3, p0, Lv60;->g:Lu8;

    .line 23
    .line 24
    iget-object v4, p0, Lv60;->h:Lga;

    .line 25
    .line 26
    iget-object v5, p0, Lv60;->i:Lyt;

    .line 27
    .line 28
    iget-object v6, p0, Lv60;->j:Lj5;

    .line 29
    .line 30
    iget-object v7, p0, Lv60;->k:Lsw;

    .line 31
    .line 32
    invoke-static/range {v0 .. v9}, Lw60;->a(Lpe0;Lc90;Ljn0;Lu8;Lga;Lyt;Lj5;Lsw;Lji;I)V

    .line 33
    .line 34
    .line 35
    sget-object p0, Lna1;->a:Lna1;

    .line 36
    .line 37
    return-object p0
.end method
