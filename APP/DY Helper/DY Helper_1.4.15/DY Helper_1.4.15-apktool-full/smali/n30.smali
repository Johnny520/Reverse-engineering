.class public final Ln30;
.super Lq30;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"


# instance fields
.field public β:Z


# virtual methods
.method public final α()Ljava/io/File;
    .locals 1

    .line 1
    iget-boolean v0, p0, Ln30;->β:Z

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    const/4 p0, 0x0

    .line 6
    return-object p0

    .line 7
    :cond_0
    const/4 v0, 0x1

    .line 8
    iput-boolean v0, p0, Ln30;->β:Z

    .line 9
    .line 10
    iget-object p0, p0, Lq30;->α:Ljava/io/File;

    .line 11
    .line 12
    return-object p0
.end method
