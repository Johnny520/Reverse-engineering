.class public LYue/ۥۢۢۤۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥ۟۠ۧۦ;
.end annotation

.annotation build LYue/ۥۡۦۥۣ;
    value = 0x13
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        LYue/ۥۢۢۤۥ$ۥ;
    }
.end annotation


# static fields
.field public static final ۥ۟۟۟:I = 0x0
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation
.end field

.field public static final ۥ۟۟۟۟:I = 0x1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation
.end field

.field public static final ۥ۟۟۟۠:I = 0x2
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation
.end field

.field public static final ۥ۟۟۟ۡ:Ljava/lang/ThreadLocal;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/lang/ThreadLocal<",
            "LYue/\u06e5\u06e1\u06e1\u06e0\u06e5;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final ۥ:I

.field public final ۥ۟:Landroidx/emoji2/text/ۥ۟۟۟۠;
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation
.end field

.field public volatile ۥ۟۟:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    new-instance v0, Ljava/lang/ThreadLocal;

    invoke-direct {v0}, Ljava/lang/ThreadLocal;-><init>()V

    sput-object v0, LYue/ۥۢۢۤۥ;->ۥ۟۟۟ۡ:Ljava/lang/ThreadLocal;

    return-void
.end method

.method public constructor <init>(Landroidx/emoji2/text/ۥ۟۟۟۠;I)V
    .locals 1
    .param p1    # Landroidx/emoji2/text/ۥ۟۟۟۠;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # I
        .annotation build LYue/ۥ۠ۥۤ;
            from = 0x0L
        .end annotation
    .end param
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, 0x0

    iput v0, p0, LYue/ۥۢۢۤۥ;->ۥ۟۟:I

    iput-object p1, p0, LYue/ۥۢۢۤۥ;->ۥ۟:Landroidx/emoji2/text/ۥ۟۟۟۠;

    iput p2, p0, LYue/ۥۢۢۤۥ;->ۥ:I

    return-void
.end method


# virtual methods
.method public toString()Ljava/lang/String;
    .locals 4
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", id:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LYue/ۥۢۢۤۥ;->ۥ۟۟۟ۡ()I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", codepoints:"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, LYue/ۥۢۢۤۥ;->ۥ۟۟()I

    move-result v1

    const/4 v2, 0x0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-virtual {p0, v2}, LYue/ۥۢۢۤۥ;->ۥ۟(I)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->toHexString(I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v3, " "

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public ۥ(Landroid/graphics/Canvas;FFLandroid/graphics/Paint;)V
    .locals 9
    .param p1    # Landroid/graphics/Canvas;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p4    # Landroid/graphics/Paint;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    iget-object v0, p0, LYue/ۥۢۢۤۥ;->ۥ۟:Landroidx/emoji2/text/ۥ۟۟۟۠;

    invoke-virtual {v0}, Landroidx/emoji2/text/ۥ۟۟۟۠;->ۥ۟۟۟ۤ()Landroid/graphics/Typeface;

    move-result-object v0

    invoke-virtual {p4}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;

    move-result-object v1

    invoke-virtual {p4, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    iget v0, p0, LYue/ۥۢۢۤۥ;->ۥ:I

    mul-int/lit8 v4, v0, 0x2

    iget-object v0, p0, LYue/ۥۢۢۤۥ;->ۥ۟:Landroidx/emoji2/text/ۥ۟۟۟۠;

    invoke-virtual {v0}, Landroidx/emoji2/text/ۥ۟۟۟۠;->ۥ۟۟۟۠()[C

    move-result-object v3

    const/4 v5, 0x2

    move-object v2, p1

    move v6, p2

    move v7, p3

    move-object v8, p4

    invoke-virtual/range {v2 .. v8}, Landroid/graphics/Canvas;->drawText([CIIFFLandroid/graphics/Paint;)V

    invoke-virtual {p4, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    return-void
.end method

.method public ۥ۟(I)I
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢۢۤۥ;->ۥ۟۟۟ۢ()LYue/ۥۡۡ۠ۥ;

    move-result-object v0

    invoke-virtual {v0, p1}, LYue/ۥۡۡ۠ۥ;->ۥ۟۟ۡۤ(I)I

    move-result p1

    return p1
.end method

.method public ۥ۟۟()I
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢۢۤۥ;->ۥ۟۟۟ۢ()LYue/ۥۡۡ۠ۥ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۡۡ۠ۥ;->ۥ۟۟ۡۧ()I

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟()S
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۢۤۥ;->ۥ۟۟۟ۢ()LYue/ۥۡۡ۠ۥ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۡۡ۠ۥ;->ۥ۟۟ۢ۟()S

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟۟()I
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "KotlinPropertyAccess"
        }
    .end annotation

    iget v0, p0, LYue/ۥۢۢۤۥ;->ۥ۟۟:I

    and-int/lit8 v0, v0, 0x3

    return v0
.end method

.method public ۥ۟۟۟۠()I
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢۢۤۥ;->ۥ۟۟۟ۢ()LYue/ۥۡۡ۠ۥ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۡۡ۠ۥ;->ۥ۟۟ۢۦ()S

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۡ()I
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۢۤۥ;->ۥ۟۟۟ۢ()LYue/ۥۡۡ۠ۥ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۡۡ۠ۥ;->ۥ۟۟ۢۧ()I

    move-result v0

    return v0
.end method

.method public final ۥ۟۟۟ۢ()LYue/ۥۡۡ۠ۥ;
    .locals 3

    sget-object v0, LYue/ۥۢۢۤۥ;->ۥ۟۟۟ۡ:Ljava/lang/ThreadLocal;

    invoke-virtual {v0}, Ljava/lang/ThreadLocal;->get()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, LYue/ۥۡۡ۠ۥ;

    if-nez v1, :cond_0

    new-instance v1, LYue/ۥۡۡ۠ۥ;

    invoke-direct {v1}, LYue/ۥۡۡ۠ۥ;-><init>()V

    invoke-virtual {v0, v1}, Ljava/lang/ThreadLocal;->set(Ljava/lang/Object;)V

    :cond_0
    iget-object v0, p0, LYue/ۥۢۢۤۥ;->ۥ۟:Landroidx/emoji2/text/ۥ۟۟۟۠;

    invoke-virtual {v0}, Landroidx/emoji2/text/ۥ۟۟۟۠;->ۥ۟۟۟ۡ()LYue/ۥۡۡ۠ۦ;

    move-result-object v0

    iget v2, p0, LYue/ۥۢۢۤۥ;->ۥ:I

    invoke-virtual {v0, v1, v2}, LYue/ۥۡۡ۠ۦ;->ۥ۟۟ۡۨ(LYue/ۥۡۡ۠ۥ;I)LYue/ۥۡۡ۠ۥ;

    return-object v1
.end method

.method public ۥۣ۟۟۟()S
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۢۤۥ;->ۥ۟۟۟ۢ()LYue/ۥۡۡ۠ۥ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۡۡ۠ۥ;->ۥ۟۟ۢۨ()S

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۤ()Landroid/graphics/Typeface;
    .locals 1
    .annotation build LYue/ۥۣۡۢۤ;
    .end annotation

    iget-object v0, p0, LYue/ۥۢۢۤۥ;->ۥ۟:Landroidx/emoji2/text/ۥ۟۟۟۠;

    invoke-virtual {v0}, Landroidx/emoji2/text/ۥ۟۟۟۠;->ۥ۟۟۟ۤ()Landroid/graphics/Typeface;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟۟۟ۥ()I
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢۢۤۥ;->ۥ۟۟۟ۢ()LYue/ۥۡۡ۠ۥ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۡۡ۠ۥ;->ۥۣ۟۟۠()S

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۦ()Z
    .locals 1

    invoke-virtual {p0}, LYue/ۥۢۢۤۥ;->ۥ۟۟۟ۢ()LYue/ۥۡۡ۠ۥ;

    move-result-object v0

    invoke-virtual {v0}, LYue/ۥۡۡ۠ۥ;->ۥ۟۟ۢۢ()Z

    move-result v0

    return v0
.end method

.method public ۥ۟۟۟ۧ()Z
    .locals 1

    iget v0, p0, LYue/ۥۢۢۤۥ;->ۥ۟۟:I

    and-int/lit8 v0, v0, 0x4

    if-lez v0, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    return v0
.end method

.method public ۥ۟۟۟ۨ()V
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥ۟۟۠ۧ:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۢۤۥ;->ۥ۟۟۟ۧ()Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    iput v0, p0, LYue/ۥۢۢۤۥ;->ۥ۟۟:I

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    iput v0, p0, LYue/ۥۢۢۤۥ;->ۥ۟۟:I

    :goto_0
    return-void
.end method

.method public ۥ۟۟۠(Z)V
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    invoke-virtual {p0}, LYue/ۥۢۢۤۥ;->ۥ۟۟۟۟()I

    move-result v0

    if-eqz p1, :cond_0

    or-int/lit8 p1, v0, 0x4

    iput p1, p0, LYue/ۥۢۢۤۥ;->ۥ۟۟:I

    goto :goto_0

    :cond_0
    iput v0, p0, LYue/ۥۢۢۤۥ;->ۥ۟۟:I

    :goto_0
    return-void
.end method

.method public ۥ۟۟۠۟(Z)V
    .locals 1
    .annotation build LYue/ۥۡۦۧ۠;
        value = {
            .enum LYue/ۥۡۦۧ۠$ۥ;->ۥۣ۟۟۠:LYue/ۥۡۦۧ۠$ۥ;
        }
    .end annotation

    .annotation build Landroid/annotation/SuppressLint;
        value = {
            "KotlinPropertyAccess"
        }
    .end annotation

    iget v0, p0, LYue/ۥۢۢۤۥ;->ۥ۟۟:I

    and-int/lit8 v0, v0, 0x4

    if-eqz p1, :cond_0

    or-int/lit8 p1, v0, 0x2

    goto :goto_0

    :cond_0
    or-int/lit8 p1, v0, 0x1

    :goto_0
    iput p1, p0, LYue/ۥۢۢۤۥ;->ۥ۟۟:I

    return-void
.end method
