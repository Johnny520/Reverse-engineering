.class public LYue/ۥ۟۟ۦۡ$ۥ۟;
.super LYue/ۥ۟۟ۦۡ$ۥ;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    value = 0x1a
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟۟ۦۡ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df"
.end annotation


# direct methods
.method public constructor <init>(LYue/ۥ۟۟ۦۡ;)V
    .locals 0

    invoke-direct {p0, p1}, LYue/ۥ۟۟ۦۡ$ۥ;-><init>(LYue/ۥ۟۟ۦۡ;)V

    return-void
.end method


# virtual methods
.method public addExtraDataToAccessibilityNodeInfo(ILandroid/view/accessibility/AccessibilityNodeInfo;Ljava/lang/String;Landroid/os/Bundle;)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۟۟ۦۡ$ۥ;->ۥ:LYue/ۥ۟۟ۦۡ;

    invoke-static {p2}, LYue/ۥ۟۟ۥۧ;->ۥ۟۠ۤۢ(Landroid/view/accessibility/AccessibilityNodeInfo;)LYue/ۥ۟۟ۥۧ;

    move-result-object p2

    invoke-virtual {v0, p1, p2, p3, p4}, LYue/ۥ۟۟ۦۡ;->ۥ(ILYue/ۥ۟۟ۥۧ;Ljava/lang/String;Landroid/os/Bundle;)V

    return-void
.end method
