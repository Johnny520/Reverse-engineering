.class public LYue/ۥۡۦۦۢ$ۥ۟۟;
.super LYue/ۥۣ۠ۨۨ;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥۡۦۦۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df"
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "LYue/\u06e5\u06e0\u06e8\u06e3\u06e8<",
        "Ljava/lang/Integer;",
        "Landroid/graphics/PorterDuffColorFilter;",
        ">;"
    }
.end annotation


# direct methods
.method public constructor <init>(I)V
    .locals 0

    invoke-direct {p0, p1}, LYue/ۥۣ۠ۨۨ;-><init>(I)V

    return-void
.end method

.method public static ۥ۟۟۠ۢ(ILandroid/graphics/PorterDuff$Mode;)I
    .locals 1

    const/16 v0, 0x1f

    add-int/2addr p0, v0

    mul-int/2addr p0, v0

    invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I

    move-result p1

    add-int/2addr p0, p1

    return p0
.end method


# virtual methods
.method public ۥۣ۟۟۠(ILandroid/graphics/PorterDuff$Mode;)Landroid/graphics/PorterDuffColorFilter;
    .locals 0

    invoke-static {p1, p2}, LYue/ۥۡۦۦۢ$ۥ۟۟;->ۥ۟۟۠ۢ(ILandroid/graphics/PorterDuff$Mode;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1}, LYue/ۥۣ۠ۨۨ;->ۥ۟۟۟۠(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/PorterDuffColorFilter;

    return-object p1
.end method

.method public ۥ۟۟۠ۤ(ILandroid/graphics/PorterDuff$Mode;Landroid/graphics/PorterDuffColorFilter;)Landroid/graphics/PorterDuffColorFilter;
    .locals 0

    invoke-static {p1, p2}, LYue/ۥۡۦۦۢ$ۥ۟۟;->ۥ۟۟۠ۢ(ILandroid/graphics/PorterDuff$Mode;)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p0, p1, p3}, LYue/ۥۣ۠ۨۨ;->ۥ۟۟۟ۤ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Landroid/graphics/PorterDuffColorFilter;

    return-object p1
.end method
