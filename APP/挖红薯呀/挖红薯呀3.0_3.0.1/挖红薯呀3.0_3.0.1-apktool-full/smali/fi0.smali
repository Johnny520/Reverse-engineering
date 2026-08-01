.class public final synthetic Lfi0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:Lpe0;

.field public final synthetic e:J

.field public final synthetic f:J

.field public final synthetic g:F

.field public final synthetic h:Lfd1;

.field public final synthetic i:Lmh;


# direct methods
.method public synthetic constructor <init>(Lpe0;JJFLfd1;Lmh;I)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lfi0;->d:Lpe0;

    .line 5
    .line 6
    iput-wide p2, p0, Lfi0;->e:J

    .line 7
    .line 8
    iput-wide p4, p0, Lfi0;->f:J

    .line 9
    .line 10
    iput p6, p0, Lfi0;->g:F

    .line 11
    .line 12
    iput-object p7, p0, Lfi0;->h:Lfd1;

    .line 13
    .line 14
    iput-object p8, p0, Lfi0;->i:Lmh;

    .line 15
    .line 16
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
    const p1, 0x30c01

    .line 10
    .line 11
    .line 12
    invoke-static {p1}, Lj50;->A(I)I

    .line 13
    .line 14
    .line 15
    move-result v9

    .line 16
    iget-object v0, p0, Lfi0;->d:Lpe0;

    .line 17
    .line 18
    iget-wide v1, p0, Lfi0;->e:J

    .line 19
    .line 20
    iget-wide v3, p0, Lfi0;->f:J

    .line 21
    .line 22
    iget v5, p0, Lfi0;->g:F

    .line 23
    .line 24
    iget-object v6, p0, Lfi0;->h:Lfd1;

    .line 25
    .line 26
    iget-object v7, p0, Lfi0;->i:Lmh;

    .line 27
    .line 28
    invoke-static/range {v0 .. v9}, Loi0;->a(Lpe0;JJFLfd1;Lmh;Lji;I)V

    .line 29
    .line 30
    .line 31
    sget-object p0, Lna1;->a:Lna1;

    .line 32
    .line 33
    return-object p0
.end method
