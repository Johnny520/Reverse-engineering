.class public final Lio/github/cherrywechat/theme/ThemeProvider;
.super Ljava/lang/Object;
.source ""


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final native extractThemeFiles(Ljava/lang/String;)Z
.end method

.method public static final native getDrawable(Landroid/content/res/Resources;Ljava/lang/String;)Landroid/graphics/drawable/Drawable;
.end method

.method public static final native getDrawableForSize(Landroid/content/res/Resources;Ljava/lang/String;II)Landroid/graphics/drawable/Drawable;
.end method

.method public static final native installTheme(Ljava/lang/String;Ljava/util/HashMap;Ljava/util/HashMap;)Z
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Integer;",
            ">;",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/String;",
            ">;)Z"
        }
    .end annotation
.end method
