.class public final synthetic Lu51;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:Z

.field public final synthetic e:Lsw;

.field public final synthetic f:Lpe0;

.field public final synthetic g:Z

.field public final synthetic h:Lt51;


# direct methods
.method public synthetic constructor <init>(ZLsw;Lpe0;ZLt51;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p1, p0, Lu51;->d:Z

    .line 5
    .line 6
    iput-object p2, p0, Lu51;->e:Lsw;

    .line 7
    .line 8
    iput-object p3, p0, Lu51;->f:Lpe0;

    .line 9
    .line 10
    iput-boolean p4, p0, Lu51;->g:Z

    .line 11
    .line 12
    iput-object p5, p0, Lu51;->h:Lt51;

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 7

    .line 1
    move-object v5, p1

    .line 2
    check-cast v5, Lji;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 7
    .line 8
    .line 9
    const/4 p1, 0x1

    .line 10
    invoke-static {p1}, Lj50;->A(I)I

    .line 11
    .line 12
    .line 13
    move-result v6

    .line 14
    iget-boolean v0, p0, Lu51;->d:Z

    .line 15
    .line 16
    iget-object v1, p0, Lu51;->e:Lsw;

    .line 17
    .line 18
    iget-object v2, p0, Lu51;->f:Lpe0;

    .line 19
    .line 20
    iget-boolean v3, p0, Lu51;->g:Z

    .line 21
    .line 22
    iget-object v4, p0, Lu51;->h:Lt51;

    .line 23
    .line 24
    invoke-static/range {v0 .. v6}, Lw51;->a(ZLsw;Lpe0;ZLt51;Lji;I)V

    .line 25
    .line 26
    .line 27
    sget-object p0, Lna1;->a:Lna1;

    .line 28
    .line 29
    return-object p0
.end method
