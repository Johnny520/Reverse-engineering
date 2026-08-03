.class public LYue/ۥۣ۠ۡۦ$ۥ۟۟۟۠;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۠ۡۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e0"
.end annotation


# instance fields
.field public final ۥ:I

.field public final ۥ۟:Ljava/lang/String;

.field public final ۥ۟۟:I

.field public final ۥ۟۟۟:I


# direct methods
.method public constructor <init>(Ljava/lang/String;II)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, LYue/ۥۣ۠ۡۦ$ۥ۟۟۟۠;->ۥ۟:Ljava/lang/String;

    .line 3
    iput p2, p0, LYue/ۥۣ۠ۡۦ$ۥ۟۟۟۠;->ۥ:I

    .line 4
    iput p3, p0, LYue/ۥۣ۠ۡۦ$ۥ۟۟۟۠;->ۥ۟۟:I

    const/4 p1, -0x1

    .line 5
    iput p1, p0, LYue/ۥۣ۠ۡۦ$ۥ۟۟۟۠;->ۥ۟۟۟:I

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;III)V
    .locals 0

    .line 6
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 7
    iput-object p1, p0, LYue/ۥۣ۠ۡۦ$ۥ۟۟۟۠;->ۥ۟:Ljava/lang/String;

    .line 8
    iput p2, p0, LYue/ۥۣ۠ۡۦ$ۥ۟۟۟۠;->ۥ:I

    .line 9
    iput p3, p0, LYue/ۥۣ۠ۡۦ$ۥ۟۟۟۠;->ۥ۟۟:I

    .line 10
    iput p4, p0, LYue/ۥۣ۠ۡۦ$ۥ۟۟۟۠;->ۥ۟۟۟:I

    return-void
.end method


# virtual methods
.method public ۥ(I)Z
    .locals 4

    iget v0, p0, LYue/ۥۣ۠ۡۦ$ۥ۟۟۟۠;->ۥ۟۟:I

    const/4 v1, 0x1

    const/4 v2, 0x7

    if-eq v0, v2, :cond_8

    if-ne p1, v2, :cond_0

    goto :goto_0

    :cond_0
    if-eq v0, p1, :cond_8

    iget v2, p0, LYue/ۥۣ۠ۡۦ$ۥ۟۟۟۠;->ۥ۟۟۟:I

    if-ne v2, p1, :cond_1

    goto :goto_0

    :cond_1
    const/4 v3, 0x4

    if-eq v0, v3, :cond_2

    if-ne v2, v3, :cond_3

    :cond_2
    const/4 v3, 0x3

    if-ne p1, v3, :cond_3

    return v1

    :cond_3
    const/16 v3, 0x9

    if-eq v0, v3, :cond_4

    if-ne v2, v3, :cond_5

    :cond_4
    const/16 v3, 0x8

    if-ne p1, v3, :cond_5

    return v1

    :cond_5
    const/16 v3, 0xc

    if-eq v0, v3, :cond_6

    if-ne v2, v3, :cond_7

    :cond_6
    const/16 v0, 0xb

    if-ne p1, v0, :cond_7

    return v1

    :cond_7
    const/4 p1, 0x0

    return p1

    :cond_8
    :goto_0
    return v1
.end method
