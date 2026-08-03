.class public final L۟/w8$a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = L۟/w8;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "a"
.end annotation


# instance fields
.field public ۥ:Landroid/net/Uri;

.field public ۥ۟:I

.field public ۥ۟۟:Landroid/graphics/Bitmap$Config;

.field public ۥ۟۠:I


# direct methods
.method public constructor <init>(Landroid/net/Uri;Landroid/graphics/Bitmap$Config;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, L۟/w8$a;->ۥ:Landroid/net/Uri;

    const/4 p1, 0x0

    iput p1, p0, L۟/w8$a;->ۥ۟:I

    iput-object p2, p0, L۟/w8$a;->ۥ۟۟:Landroid/graphics/Bitmap$Config;

    return-void
.end method
