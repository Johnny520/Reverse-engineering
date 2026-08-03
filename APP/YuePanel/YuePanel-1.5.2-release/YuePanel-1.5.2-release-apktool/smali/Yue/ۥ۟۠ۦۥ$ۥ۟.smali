.class public LYue/ۥ۟۠ۦۥ$ۥ۟;
.super LYue/ۥ۟۠ۦۥ$ۥ۟۟۟ۡ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۠ۦۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df"
.end annotation


# instance fields
.field public final ۥ:Landroid/graphics/drawable/Animatable;


# direct methods
.method public constructor <init>(Landroid/graphics/drawable/Animatable;)V
    .locals 1

    const/4 v0, 0x0

    invoke-direct {p0, v0}, LYue/ۥ۟۠ۦۥ$ۥ۟۟۟ۡ;-><init>(LYue/ۥ۟۠ۦۥ$ۥ;)V

    iput-object p1, p0, LYue/ۥ۟۠ۦۥ$ۥ۟;->ۥ:Landroid/graphics/drawable/Animatable;

    return-void
.end method


# virtual methods
.method public ۥ۟۟()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۟۠ۦۥ$ۥ۟;->ۥ:Landroid/graphics/drawable/Animatable;

    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->start()V

    return-void
.end method

.method public ۥ۟۟۟()V
    .locals 1

    iget-object v0, p0, LYue/ۥ۟۠ۦۥ$ۥ۟;->ۥ:Landroid/graphics/drawable/Animatable;

    invoke-interface {v0}, Landroid/graphics/drawable/Animatable;->stop()V

    return-void
.end method
