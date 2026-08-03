.class public LYue/ۥۣۢۥۣ$ۥ۟;
.super LYue/ۥۣۢۥۣ$ۥ۟۟۟۠;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣۢۥۣ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df"
.end annotation


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, LYue/ۥۣۢۥۣ$ۥ۟۟۟۠;-><init>()V

    return-void
.end method

.method public constructor <init>(LYue/ۥۣۢۥۣ$ۥ۟;)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, LYue/ۥۣۢۥۣ$ۥ۟۟۟۠;-><init>(LYue/ۥۣۢۥۣ$ۥ۟۟۟۠;)V

    return-void
.end method

.method private ۥ۟۟۟ۤ(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 3

    const/4 v0, 0x0

    invoke-virtual {p1, v0}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_0

    iput-object v1, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟۠;->ۥ۟:Ljava/lang/String;

    :cond_0
    const/4 v1, 0x1

    invoke-virtual {p1, v1}, Landroid/content/res/TypedArray;->getString(I)Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_1

    invoke-static {v1}, LYue/ۥۣۣۡۨ;->ۥ۟۟۟(Ljava/lang/String;)[LYue/ۥۣۣۡۨ$ۥ۟;

    move-result-object v1

    iput-object v1, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟۠;->ۥ:[LYue/ۥۣۣۡۨ$ۥ۟;

    :cond_1
    const-string v1, "fillType"

    const/4 v2, 0x2

    invoke-static {p1, p2, v1, v2, v0}, LYue/ۥۣۢۢۦ;->ۥ۟۟۟ۥ(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;II)I

    move-result p1

    iput p1, p0, LYue/ۥۣۢۥۣ$ۥ۟۟۟۠;->ۥ۟۟:I

    return-void
.end method


# virtual methods
.method public ۥ۟۟۟۟()Z
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public ۥۣ۟۟۟(Landroid/content/res/Resources;Landroid/util/AttributeSet;Landroid/content/res/Resources$Theme;Lorg/xmlpull/v1/XmlPullParser;)V
    .locals 1

    const-string v0, "pathData"

    invoke-static {p4, v0}, LYue/ۥۣۢۢۦ;->ۥ۟۟۠ۡ(Lorg/xmlpull/v1/XmlPullParser;Ljava/lang/String;)Z

    move-result v0

    if-nez v0, :cond_0

    return-void

    :cond_0
    sget-object v0, LYue/ۥ۟۠ۥۢ;->ۥ۟۟ۡۧ:[I

    invoke-static {p1, p3, p2, v0}, LYue/ۥۣۢۢۦ;->ۥ۟۟۠ۢ(Landroid/content/res/Resources;Landroid/content/res/Resources$Theme;Landroid/util/AttributeSet;[I)Landroid/content/res/TypedArray;

    move-result-object p1

    invoke-direct {p0, p1, p4}, LYue/ۥۣۢۥۣ$ۥ۟;->ۥ۟۟۟ۤ(Landroid/content/res/TypedArray;Lorg/xmlpull/v1/XmlPullParser;)V

    invoke-virtual {p1}, Landroid/content/res/TypedArray;->recycle()V

    return-void
.end method
