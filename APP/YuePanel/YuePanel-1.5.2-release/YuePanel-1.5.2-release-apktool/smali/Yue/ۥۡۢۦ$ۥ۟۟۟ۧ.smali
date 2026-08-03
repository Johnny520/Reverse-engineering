.class public final LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۢۦ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "\u06e5\u06df\u06df\u06df\u06e7"
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟;,
        LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ;,
        LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟۟;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟ۢ:I = 0x1

.field public static final ۥۣ۟۟۟:I = 0x2


# instance fields
.field public ۥ:Landroid/app/PendingIntent;

.field public ۥ۟:Landroid/app/PendingIntent;

.field public ۥ۟۟:Landroidx/core/graphics/drawable/IconCompat;

.field public ۥ۟۟۟:I

.field public ۥ۟۟۟۟:I
    .annotation build LYue/ۥ۠۟ۡ;
    .end annotation
.end field

.field public ۥ۟۟۟۠:I

.field public ۥ۟۟۟ۡ:Ljava/lang/String;


# direct methods
.method public constructor <init>(Landroid/app/PendingIntent;Landroid/app/PendingIntent;Landroidx/core/graphics/drawable/IconCompat;IIILjava/lang/String;)V
    .locals 0
    .param p1    # Landroid/app/PendingIntent;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p2    # Landroid/app/PendingIntent;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p3    # Landroidx/core/graphics/drawable/IconCompat;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .param p5    # I
        .annotation build LYue/ۥ۠۟ۡ;
        .end annotation
    .end param
    .param p7    # Ljava/lang/String;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;->ۥ:Landroid/app/PendingIntent;

    .line 4
    iput-object p3, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;->ۥ۟۟:Landroidx/core/graphics/drawable/IconCompat;

    .line 5
    iput p4, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;->ۥ۟۟۟:I

    .line 6
    iput p5, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;->ۥ۟۟۟۟:I

    .line 7
    iput-object p2, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;->ۥ۟:Landroid/app/PendingIntent;

    .line 8
    iput p6, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;->ۥ۟۟۟۠:I

    .line 9
    iput-object p7, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;->ۥ۟۟۟ۡ:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Landroid/app/PendingIntent;Landroid/app/PendingIntent;Landroidx/core/graphics/drawable/IconCompat;IIILjava/lang/String;LYue/ۥۡۢۦ$ۥ;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p7}, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;-><init>(Landroid/app/PendingIntent;Landroid/app/PendingIntent;Landroidx/core/graphics/drawable/IconCompat;IIILjava/lang/String;)V

    return-void
.end method

.method public static ۥ(Landroid/app/Notification$BubbleMetadata;)LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;
    .locals 3
    .param p0    # Landroid/app/Notification$BubbleMetadata;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v1, v2, :cond_1

    invoke-static {p0}, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟;->ۥ(Landroid/app/Notification$BubbleMetadata;)LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;

    move-result-object p0

    return-object p0

    :cond_1
    const/16 v2, 0x1d

    if-ne v1, v2, :cond_2

    invoke-static {p0}, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ;->ۥ(Landroid/app/Notification$BubbleMetadata;)LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v0
.end method

.method public static ۥ۟۟۟ۥ(LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;)Landroid/app/Notification$BubbleMetadata;
    .locals 3
    .param p0    # LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;
        .annotation build LYue/ۥۡۢۧ۠;
        .end annotation
    .end param
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    const/4 v0, 0x0

    if-nez p0, :cond_0

    return-object v0

    :cond_0
    sget v1, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v2, 0x1e

    if-lt v1, v2, :cond_1

    invoke-static {p0}, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ۟;->ۥ۟(LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;)Landroid/app/Notification$BubbleMetadata;

    move-result-object p0

    return-object p0

    :cond_1
    const/16 v2, 0x1d

    if-ne v1, v2, :cond_2

    invoke-static {p0}, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ$ۥ;->ۥ۟(LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;)Landroid/app/Notification$BubbleMetadata;

    move-result-object p0

    return-object p0

    :cond_2
    return-object v0
.end method


# virtual methods
.method public ۥ۟()Z
    .locals 2

    iget v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;->ۥ۟۟۟۠:I

    const/4 v1, 0x1

    and-int/2addr v0, v1

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    return v1
.end method

.method public ۥ۟۟()Landroid/app/PendingIntent;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;->ۥ۟:Landroid/app/PendingIntent;

    return-object v0
.end method

.method public ۥ۟۟۟()I
    .locals 1
    .annotation build LYue/ۥ۠۟ۡ۟;
        unit = 0x0
    .end annotation

    iget v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;->ۥ۟۟۟:I

    return v0
.end method

.method public ۥ۟۟۟۟()I
    .locals 1
    .annotation build LYue/ۥ۠۟ۡ;
    .end annotation

    iget v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;->ۥ۟۟۟۟:I

    return v0
.end method

.method public ۥ۟۟۟۠()Landroidx/core/graphics/drawable/IconCompat;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InvalidNullConversion"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;->ۥ۟۟:Landroidx/core/graphics/drawable/IconCompat;

    return-object v0
.end method

.method public ۥ۟۟۟ۡ()Landroid/app/PendingIntent;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "InvalidNullConversion"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;->ۥ:Landroid/app/PendingIntent;

    return-object v0
.end method

.method public ۥ۟۟۟ۢ()Ljava/lang/String;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;->ۥ۟۟۟ۡ:Ljava/lang/String;

    return-object v0
.end method

.method public ۥۣ۟۟۟()Z
    .locals 1

    iget v0, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;->ۥ۟۟۟۠:I

    and-int/lit8 v0, v0, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟۟ۤ(I)V
    .locals 0
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۥ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    iput p1, p0, LYue/ۥۡۢۦ$ۥ۟۟۟ۧ;->ۥ۟۟۟۠:I

    return-void
.end method
