.class public final synthetic Lwc0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lww;


# instance fields
.field public final synthetic d:Z

.field public final synthetic e:Lsw;


# direct methods
.method public synthetic constructor <init>(Lsw;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-boolean p2, p0, Lwc0;->d:Z

    .line 5
    .line 6
    iput-object p1, p0, Lwc0;->e:Lsw;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    .line 1
    check-cast p1, Lji;

    .line 2
    .line 3
    check-cast p2, Ljava/lang/Integer;

    .line 4
    .line 5
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 6
    .line 7
    .line 8
    move-result p2

    .line 9
    iget-boolean v0, p0, Lwc0;->d:Z

    .line 10
    .line 11
    iget-object p0, p0, Lwc0;->e:Lsw;

    .line 12
    .line 13
    invoke-static {v0, p0, p1, p2}, Lzc0;->w(ZLsw;Lji;I)Lna1;

    .line 14
    .line 15
    .line 16
    move-result-object p0

    .line 17
    return-object p0
.end method
