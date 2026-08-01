.class public final synthetic Lpc0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:Ljava/lang/String;

.field public final synthetic e:Lpe0;

.field public final synthetic f:I

.field public final synthetic g:I


# direct methods
.method public synthetic constructor <init>(Ljava/lang/String;Lpe0;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lpc0;->d:Ljava/lang/String;

    .line 5
    .line 6
    iput-object p2, p0, Lpc0;->e:Lpe0;

    .line 7
    .line 8
    iput p3, p0, Lpc0;->f:I

    .line 9
    .line 10
    iput p4, p0, Lpc0;->g:I

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v4, p1

    .line 2
    check-cast v4, Lji;

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
    iget-object v0, p0, Lpc0;->d:Ljava/lang/String;

    .line 11
    .line 12
    iget-object v1, p0, Lpc0;->e:Lpe0;

    .line 13
    .line 14
    iget v2, p0, Lpc0;->f:I

    .line 15
    .line 16
    iget v3, p0, Lpc0;->g:I

    .line 17
    .line 18
    invoke-static/range {v0 .. v5}, Lzc0;->t(Ljava/lang/String;Lpe0;IILji;I)Lna1;

    .line 19
    .line 20
    .line 21
    move-result-object p0

    .line 22
    return-object p0
.end method
