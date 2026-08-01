.class public final synthetic Lhi0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:Ljw0;

.field public final synthetic e:Z

.field public final synthetic f:Lhw;

.field public final synthetic g:Lww;

.field public final synthetic h:Lpe0;

.field public final synthetic i:Z

.field public final synthetic j:Lww;

.field public final synthetic k:Z

.field public final synthetic l:Lei0;

.field public final synthetic m:I


# direct methods
.method public synthetic constructor <init>(Ljw0;ZLhw;Lww;Lpe0;ZLww;ZLei0;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lhi0;->d:Ljw0;

    .line 5
    .line 6
    iput-boolean p2, p0, Lhi0;->e:Z

    .line 7
    .line 8
    iput-object p3, p0, Lhi0;->f:Lhw;

    .line 9
    .line 10
    iput-object p4, p0, Lhi0;->g:Lww;

    .line 11
    .line 12
    iput-object p5, p0, Lhi0;->h:Lpe0;

    .line 13
    .line 14
    iput-boolean p6, p0, Lhi0;->i:Z

    .line 15
    .line 16
    iput-object p7, p0, Lhi0;->j:Lww;

    .line 17
    .line 18
    iput-boolean p8, p0, Lhi0;->k:Z

    .line 19
    .line 20
    iput-object p9, p0, Lhi0;->l:Lei0;

    .line 21
    .line 22
    iput p10, p0, Lhi0;->m:I

    .line 23
    .line 24
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 11

    .line 1
    move-object v9, p1

    .line 2
    check-cast v9, Lji;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    iget p1, p0, Lhi0;->m:I

    .line 10
    .line 11
    or-int/lit8 p1, p1, 0x1

    .line 12
    .line 13
    invoke-static {p1}, Lj50;->A(I)I

    .line 14
    .line 15
    .line 16
    move-result v10

    .line 17
    iget-object v0, p0, Lhi0;->d:Ljw0;

    .line 18
    .line 19
    iget-boolean v1, p0, Lhi0;->e:Z

    .line 20
    .line 21
    iget-object v2, p0, Lhi0;->f:Lhw;

    .line 22
    .line 23
    iget-object v3, p0, Lhi0;->g:Lww;

    .line 24
    .line 25
    iget-object v4, p0, Lhi0;->h:Lpe0;

    .line 26
    .line 27
    iget-boolean v5, p0, Lhi0;->i:Z

    .line 28
    .line 29
    iget-object v6, p0, Lhi0;->j:Lww;

    .line 30
    .line 31
    iget-boolean v7, p0, Lhi0;->k:Z

    .line 32
    .line 33
    iget-object v8, p0, Lhi0;->l:Lei0;

    .line 34
    .line 35
    invoke-static/range {v0 .. v10}, Loi0;->b(Ljw0;ZLhw;Lww;Lpe0;ZLww;ZLei0;Lji;I)V

    .line 36
    .line 37
    .line 38
    sget-object p0, Lna1;->a:Lna1;

    .line 39
    .line 40
    return-object p0
.end method
