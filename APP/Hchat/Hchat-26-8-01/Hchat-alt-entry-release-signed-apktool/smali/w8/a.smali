.class public final Lw8/a;
.super Ljava/lang/Object;
.source "r8-map-id-410253dec230a6d44f261a3a84880494196f082735db3c71240f387861686496"


# static fields
.field public static final d:Ljava/util/List;


# instance fields
.field public final a:Lr8/g;

.field public final b:Landroid/content/SharedPreferences;

.field public final c:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    .line 1
    const-string v0, "com.tencent.mm.plugin.gallery.ui.AlbumPreviewUI"

    .line 2
    .line 3
    const-string v1, "com.tencent.mm.plugin.gallery.ui.ImagePreviewUI"

    .line 4
    .line 5
    filled-new-array {v0, v1}, [Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    invoke-static {v0}, La/a;->y0([Ljava/lang/Object;)Ljava/util/List;

    .line 10
    .line 11
    .line 12
    move-result-object v0

    .line 13
    sput-object v0, Lw8/a;->d:Ljava/util/List;

    .line 14
    .line 15
    return-void
.end method

.method public constructor <init>(Lr8/g;)V
    .locals 1

    .line 1
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 2
    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lw8/a;->a:Lr8/g;

    .line 8
    .line 9
    iget-object p1, p1, Lr8/g;->a:Landroid/content/Context;

    .line 10
    .line 11
    const-string v0, "Hchat_auto_original_image_config"

    .line 12
    .line 13
    invoke-static {p1, v0}, Lub/b;->c(Landroid/content/Context;Ljava/lang/String;)Landroid/content/SharedPreferences;

    .line 14
    .line 15
    .line 16
    move-result-object p1

    .line 17
    iput-object p1, p0, Lw8/a;->b:Landroid/content/SharedPreferences;

    .line 18
    .line 19
    invoke-static {}, Ljava/util/concurrent/ConcurrentHashMap;->newKeySet()Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 20
    .line 21
    .line 22
    move-result-object p1

    .line 23
    iput-object p1, p0, Lw8/a;->c:Ljava/util/concurrent/ConcurrentHashMap$KeySetView;

    .line 24
    .line 25
    return-void
.end method
