.class public final synthetic Lba;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lpe0;

.field public final synthetic f:Ls71;

.field public final synthetic g:I

.field public final synthetic h:Z

.field public final synthetic i:I

.field public final synthetic j:I

.field public final synthetic k:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lpe0;Ls71;IZIII)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lba;->d:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lba;->e:Lpe0;

    .line 7
    .line 8
    iput-object p3, p0, Lba;->f:Ls71;

    .line 9
    .line 10
    iput p4, p0, Lba;->g:I

    .line 11
    .line 12
    iput-boolean p5, p0, Lba;->h:Z

    .line 13
    .line 14
    iput p6, p0, Lba;->i:I

    .line 15
    .line 16
    iput p7, p0, Lba;->j:I

    .line 17
    .line 18
    iput p8, p0, Lba;->k:I

    .line 19
    .line 20
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 9

    .line 1
    move-object v7, p1

    .line 2
    check-cast v7, Lji;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lba;->k:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lj50;->A(I)I

    .line 14
    .line 15
    .line 16
    move-result v8

    .line 17
    iget-object v0, p0, Lba;->d:Ljava/lang/String;

    .line 18
    .line 19
    iget-object v1, p0, Lba;->e:Lpe0;

    .line 20
    .line 21
    iget-object v2, p0, Lba;->f:Ls71;

    .line 22
    .line 23
    iget v3, p0, Lba;->g:I

    .line 24
    .line 25
    iget-boolean v4, p0, Lba;->h:Z

    .line 26
    .line 27
    iget v5, p0, Lba;->i:I

    .line 28
    .line 29
    iget v6, p0, Lba;->j:I

    .line 30
    .line 31
    invoke-static/range {v0 .. v8}, Ls91;->a(Ljava/lang/String;Lpe0;Ls71;IZIILji;I)V

    .line 32
    .line 33
    .line 34
    sget-object p0, Lna1;->a:Lna1;

    .line 35
    .line 36
    return-object p0
.end method
