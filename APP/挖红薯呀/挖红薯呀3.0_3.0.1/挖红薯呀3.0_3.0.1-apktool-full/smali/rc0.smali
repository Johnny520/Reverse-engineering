.class public final synthetic Lrc0;
.super Ljava/lang/Object;
.source "r8-map-id-e5f12e05914b1567e56537e51cf4f61ddbc52d612246f0b3fdf98f4190b0dcf6"

# interfaces
.implements Lyw;


# instance fields
.field public final synthetic d:Ljava/util/List;

.field public final synthetic e:Landroid/content/Context;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;Ljava/util/List;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p2, p0, Lrc0;->d:Ljava/util/List;

    .line 5
    .line 6
    iput-object p1, p0, Lrc0;->e:Landroid/content/Context;

    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final b(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    .line 1
    move-object v2, p1

    .line 2
    check-cast v2, Lx60;

    .line 3
    .line 4
    check-cast p2, Ljava/lang/Integer;

    .line 5
    .line 6
    invoke-virtual {p2}, Ljava/lang/Integer;->intValue()I

    .line 7
    .line 8
    .line 9
    move-result v3

    .line 10
    move-object v4, p3

    .line 11
    check-cast v4, Lji;

    .line 12
    .line 13
    check-cast p4, Ljava/lang/Integer;

    .line 14
    .line 15
    invoke-virtual {p4}, Ljava/lang/Integer;->intValue()I

    .line 16
    .line 17
    .line 18
    move-result v5

    .line 19
    iget-object v0, p0, Lrc0;->d:Ljava/util/List;

    .line 20
    .line 21
    iget-object v1, p0, Lrc0;->e:Landroid/content/Context;

    .line 22
    .line 23
    invoke-static/range {v0 .. v5}, Lzc0;->E(Ljava/util/List;Landroid/content/Context;Lx60;ILji;I)Lna1;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    return-object p0
.end method
