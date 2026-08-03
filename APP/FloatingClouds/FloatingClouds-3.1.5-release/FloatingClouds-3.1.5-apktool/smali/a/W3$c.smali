.class public final La/W3$c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements La/W3$b;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = La/W3;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "c"
.end annotation


# instance fields
.field public a:Landroid/content/ClipData;

.field public b:I

.field public c:I

.field public d:Landroid/net/Uri;

.field public e:Landroid/os/Bundle;


# virtual methods
.method public final a()La/W3;
    .locals 2

    new-instance v0, La/W3;

    new-instance v1, La/W3$f;

    invoke-direct {v1, p0}, La/W3$f;-><init>(La/W3$c;)V

    invoke-direct {v0, v1}, La/W3;-><init>(La/W3$e;)V

    return-object v0
.end method

.method public final b(Landroid/net/Uri;)V
    .locals 0

    iput-object p1, p0, La/W3$c;->d:Landroid/net/Uri;

    return-void
.end method

.method public final c(I)V
    .locals 0

    iput p1, p0, La/W3$c;->c:I

    return-void
.end method

.method public final setExtras(Landroid/os/Bundle;)V
    .locals 0

    iput-object p1, p0, La/W3$c;->e:Landroid/os/Bundle;

    return-void
.end method
