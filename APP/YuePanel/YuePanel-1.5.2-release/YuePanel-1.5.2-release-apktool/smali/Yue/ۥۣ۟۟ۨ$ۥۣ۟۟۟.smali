.class public LYue/ۥۣ۟۟ۨ$ۥۣ۟۟۟;
.super LYue/ۥ۟۟ۨۢ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x13
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۣ۟۟ۨ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df\u06e3"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۣ۟۟ۨ$ۥۣ۟۟۟$ۥ;
    }
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06df\u06df\u06e8\u06e2<",
        "LYue/\u06e5\u06e1\u06e4\u06e0\u06e7;",
        "Ljava/util/List<",
        "Landroid/net/Uri;",
        ">;>;"
    }
.end annotation


# static fields
.field public static final ۥ۟:LYue/ۥۣ۟۟ۨ$ۥۣ۟۟۟$ۥ;
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation
.end field


# instance fields
.field public final ۥ:I


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, LYue/ۥۣ۟۟ۨ$ۥۣ۟۟۟$ۥ;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, LYue/ۥۣ۟۟ۨ$ۥۣ۟۟۟$ۥ;-><init>(LYue/ۥ۟ۨۥۢ;)V

    sput-object v0, LYue/ۥۣ۟۟ۨ$ۥۣ۟۟۟;->ۥ۟:LYue/ۥۣ۟۟ۨ$ۥۣ۟۟۟$ۥ;

    return-void
.end method

.method public constructor <init>()V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    .line 1
    invoke-direct {p0, v2, v0, v1}, LYue/ۥۣ۟۟ۨ$ۥۣ۟۟۟;-><init>(IILYue/ۥ۟ۨۥۢ;)V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 1

    .line 4
    invoke-direct {p0}, LYue/ۥ۟۟ۨۢ;-><init>()V

    .line 5
    iput p1, p0, LYue/ۥۣ۟۟ۨ$ۥۣ۟۟۟;->ۥ:I

    const/4 v0, 0x1

    if-le p1, v0, :cond_0

    return-void

    .line 6
    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string v0, "Max items must be higher than 1"

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1
.end method

.method public synthetic constructor <init>(IILYue/ۥ۟ۨۥۢ;)V
    .locals 0

    and-int/lit8 p2, p2, 0x1

    if-eqz p2, :cond_0

    .line 2
    sget-object p1, LYue/ۥۣ۟۟ۨ$ۥۣ۟۟۟;->ۥ۟:LYue/ۥۣ۟۟ۨ$ۥۣ۟۟۟$ۥ;

    invoke-virtual {p1}, LYue/ۥۣ۟۟ۨ$ۥۣ۟۟۟$ۥ;->ۥ()I

    move-result p1

    .line 3
    :cond_0
    invoke-direct {p0, p1}, LYue/ۥۣ۟۟ۨ$ۥۣ۟۟۟;-><init>(I)V

    return-void
.end method


# virtual methods
.method public bridge synthetic ۥ(Landroid/content/Context;Ljava/lang/Object;)Landroid/content/Intent;
    .locals 0

    check-cast p2, LYue/ۥۡۤ۠ۧ;

    invoke-virtual {p0, p1, p2}, LYue/ۥۣ۟۟ۨ$ۥۣ۟۟۟;->ۥ۟۟۟(Landroid/content/Context;LYue/ۥۡۤ۠ۧ;)Landroid/content/Intent;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۥ۟(Landroid/content/Context;Ljava/lang/Object;)LYue/ۥ۟۟ۨۢ$ۥ;
    .locals 0

    check-cast p2, LYue/ۥۡۤ۠ۧ;

    invoke-virtual {p0, p1, p2}, LYue/ۥۣ۟۟ۨ$ۥۣ۟۟۟;->ۥ۟۟۟۟(Landroid/content/Context;LYue/ۥۡۤ۠ۧ;)LYue/ۥ۟۟ۨۢ$ۥ;

    move-result-object p1

    return-object p1
.end method

.method public bridge synthetic ۥ۟۟(ILandroid/content/Intent;)Ljava/lang/Object;
    .locals 0

    invoke-virtual {p0, p1, p2}, LYue/ۥۣ۟۟ۨ$ۥۣ۟۟۟;->ۥ۟۟۟۠(ILandroid/content/Intent;)Ljava/util/List;

    move-result-object p1

    return-object p1
.end method

.method public ۥ۟۟۟(Landroid/content/Context;LYue/ۥۡۤ۠ۧ;)Landroid/content/Intent;
    .locals 4
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۡۤ۠ۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۣ۟ۦۥ;
    .end annotation

    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "NewApi",
            "ClassVerificationFailure"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "input"

    invoke-static {p2, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ;->ۥ:LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ;

    invoke-virtual {v0}, LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ;->ۥ۟۟۟ۤ()Z

    move-result v1

    if-eqz v1, :cond_1

    new-instance p1, Landroid/content/Intent;

    const-string v1, "android.provider.action.PICK_IMAGES"

    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, LYue/ۥۡۤ۠ۧ;->ۥ()LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟۟۟۠;

    move-result-object p2

    invoke-virtual {v0, p2}, LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ;->ۥ۟۟۟۟(LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟۟۟۠;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    iget p2, p0, LYue/ۥۣ۟۟ۨ$ۥۣ۟۟۟;->ۥ:I

    invoke-static {}, LYue/ۥ۟۟ۨۤ;->ۥ()I

    move-result v0

    if-gt p2, v0, :cond_0

    const-string p2, "android.provider.extra.PICK_IMAGES_MAX"

    iget v0, p0, LYue/ۥۣ۟۟ۨ$ۥۣ۟۟۟;->ۥ:I

    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    goto/16 :goto_0

    :cond_0
    new-instance p1, Ljava/lang/IllegalArgumentException;

    const-string p2, "Max items must be less or equals MediaStore.getPickImagesMaxLimit()"

    invoke-virtual {p2}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_1
    invoke-virtual {v0, p1}, LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ;->ۥۣ۟۟۟(Landroid/content/Context;)Z

    move-result v1

    const-string v2, "com.google.android.gms.provider.extra.PICK_IMAGES_MAX"

    const-string v3, "Required value was null."

    if-eqz v1, :cond_3

    invoke-virtual {v0, p1}, LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ;->ۥ۟۟۟(Landroid/content/Context;)Landroid/content/pm/ResolveInfo;

    move-result-object p1

    if-eqz p1, :cond_2

    iget-object p1, p1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    new-instance v1, Landroid/content/Intent;

    const-string v3, "androidx.activity.result.contract.action.PICK_IMAGES"

    invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v3, p1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v3, v3, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    iget-object p1, p1, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-virtual {v1, v3, p1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    invoke-virtual {p2}, LYue/ۥۡۤ۠ۧ;->ۥ()LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟۟۟۠;

    move-result-object p1

    invoke-virtual {v0, p1}, LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ;->ۥ۟۟۟۟(LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟۟۟۠;)Ljava/lang/String;

    move-result-object p1

    invoke-virtual {v1, p1}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    iget p1, p0, LYue/ۥۣ۟۟ۨ$ۥۣ۟۟۟;->ۥ:I

    invoke-virtual {v1, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    move-object p1, v1

    goto :goto_0

    :cond_2
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_3
    invoke-virtual {v0, p1}, LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ;->ۥ۟۟۟۠(Landroid/content/Context;)Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-virtual {v0, p1}, LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ;->ۥ۟۟(Landroid/content/Context;)Landroid/content/pm/ResolveInfo;

    move-result-object p1

    if-eqz p1, :cond_4

    iget-object p1, p1, Landroid/content/pm/ResolveInfo;->activityInfo:Landroid/content/pm/ActivityInfo;

    new-instance p2, Landroid/content/Intent;

    const-string v0, "com.google.android.gms.provider.action.PICK_IMAGES"

    invoke-direct {p2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    iget-object v0, p1, Landroid/content/pm/ActivityInfo;->applicationInfo:Landroid/content/pm/ApplicationInfo;

    iget-object v0, v0, Landroid/content/pm/ApplicationInfo;->packageName:Ljava/lang/String;

    iget-object p1, p1, Landroid/content/pm/ActivityInfo;->name:Ljava/lang/String;

    invoke-virtual {p2, v0, p1}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    iget p1, p0, LYue/ۥۣ۟۟ۨ$ۥۣ۟۟۟;->ۥ:I

    invoke-virtual {p2, v2, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;

    move-object p1, p2

    goto :goto_0

    :cond_4
    new-instance p1, Ljava/lang/IllegalStateException;

    invoke-virtual {v3}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object p2

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_5
    new-instance p1, Landroid/content/Intent;

    const-string v1, "android.intent.action.OPEN_DOCUMENT"

    invoke-direct {p1, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    invoke-virtual {p2}, LYue/ۥۡۤ۠ۧ;->ۥ()LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟۟۟۠;

    move-result-object p2

    invoke-virtual {v0, p2}, LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ;->ۥ۟۟۟۟(LYue/ۥۣ۟۟ۨ$ۥ۟۟۟ۤ$ۥ۟۟۟۠;)Ljava/lang/String;

    move-result-object p2

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string p2, "android.intent.extra.ALLOW_MULTIPLE"

    const/4 v0, 0x1

    invoke-virtual {p1, p2, v0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;

    invoke-virtual {p1}, Landroid/content/Intent;->getType()Ljava/lang/String;

    move-result-object p2

    if-nez p2, :cond_6

    const-string p2, "*/*"

    invoke-virtual {p1, p2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    const-string p2, "image/*"

    const-string v0, "video/*"

    filled-new-array {p2, v0}, [Ljava/lang/String;

    move-result-object p2

    const-string v0, "android.intent.extra.MIME_TYPES"

    invoke-virtual {p1, v0, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;[Ljava/lang/String;)Landroid/content/Intent;

    :cond_6
    :goto_0
    return-object p1
.end method

.method public final ۥ۟۟۟۟(Landroid/content/Context;LYue/ۥۡۤ۠ۧ;)LYue/ۥ۟۟ۨۢ$ۥ;
    .locals 1
    .param p1    # Landroid/content/Context;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .param p2    # LYue/ۥۡۤ۠ۧ;
        .annotation build LYue/ۥۡۢۥ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۟;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroid/content/Context;",
            "LYue/\u06e5\u06e1\u06e4\u06e0\u06e7;",
            ")",
            "LYue/\u06e5\u06df\u06df\u06e8\u06e2$\u06e5<",
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;>;"
        }
    .end annotation

    const-string v0, "context"

    invoke-static {p1, v0}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "input"

    invoke-static {p2, p1}, LYue/ۥ۠ۥۧ۠;->ۥ۟۟۠۟(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public final ۥ۟۟۟۠(ILandroid/content/Intent;)Ljava/util/List;
    .locals 1
    .param p2    # Landroid/content/Intent;
        .annotation build LYue/ۥۡۢۧ۟;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Landroid/content/Intent;",
            ")",
            "Ljava/util/List<",
            "Landroid/net/Uri;",
            ">;"
        }
    .end annotation

    const/4 v0, -0x1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    :goto_0
    if-eqz p2, :cond_1

    sget-object p1, LYue/ۥۣ۟۟ۨ$ۥ۟۟۟;->ۥ:LYue/ۥۣ۟۟ۨ$ۥ۟۟۟$ۥ;

    invoke-virtual {p1, p2}, LYue/ۥۣ۟۟ۨ$ۥ۟۟۟$ۥ;->ۥ(Landroid/content/Intent;)Ljava/util/List;

    move-result-object p1

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-static {}, LYue/ۥ۟ۥۣۡ;->ۥۣ۟۟ۡ()Ljava/util/List;

    move-result-object p1

    :goto_1
    return-object p1
.end method
