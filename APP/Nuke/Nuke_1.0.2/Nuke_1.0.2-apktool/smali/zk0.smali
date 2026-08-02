.class public final Lzk0;
.super Lyh1;
.source "r8-map-id-1fdf33e95b2c98e9913e3f754a675e277db58555c92b1678ad704849f4b90bb4"


# annotations
.annotation system Ldalvik/annotation/Signature;
    value = {
        "Lyh1;"
    }
.end annotation


# instance fields
.field public final synthetic a:Lbl0;


# direct methods
.method public constructor <init>(Lbl0;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lzk0;->a:Lbl0;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 0

    .line 1
    if-ne p1, p0, :cond_0

    .line 2
    .line 3
    const/4 p0, 0x1

    .line 4
    return p0

    .line 5
    :cond_0
    const/4 p0, 0x0

    .line 6
    return p0
.end method

.method public final f()Lth1;
    .locals 0

    .line 1
    iget-object p0, p0, Lzk0;->a:Lbl0;

    .line 2
    .line 3
    iget-object p0, p0, Lbl0;->c:Lpl0;

    .line 4
    .line 5
    return-object p0
.end method

.method public final bridge synthetic g(Lth1;)V
    .locals 0

    .line 1
    check-cast p1, Lpl0;

    .line 2
    .line 3
    return-void
.end method

.method public final hashCode()I
    .locals 0

    .line 1
    iget-object p0, p0, Lzk0;->a:Lbl0;

    .line 2
    .line 3
    iget-object p0, p0, Lbl0;->c:Lpl0;

    .line 4
    .line 5
    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    .line 6
    .line 7
    .line 8
    move-result p0

    .line 9
    return p0
.end method
