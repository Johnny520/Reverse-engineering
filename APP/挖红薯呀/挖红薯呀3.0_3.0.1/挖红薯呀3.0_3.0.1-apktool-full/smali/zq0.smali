.class public final Lzq0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Len0;


# instance fields
.field public d:Lyd0;

.field public final e:Lyb0;


# direct methods
.method public constructor <init>(Lyd0;Lyb0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzq0;->d:Lyd0;

    .line 5
    .line 6
    iput-object p2, p0, Lzq0;->e:Lyb0;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final q()Z
    .locals 0

    .line 1
    iget-object p0, p0, Lzq0;->e:Lyb0;

    .line 2
    .line 3
    invoke-virtual {p0}, Lyb0;->l0()Li50;

    .line 4
    .line 5
    .line 6
    move-result-object p0

    .line 7
    invoke-interface {p0}, Li50;->z()Z

    .line 8
    .line 9
    .line 10
    move-result p0

    .line 11
    return p0
.end method
