.class public final LYue/ۥۡ۠ۦۦ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements LYue/ۥۡۨۢ;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = LYue/ۥۡ۠ۦۦ;->ۥ۟۟۟۟(Landroid/view/Menu;)LYue/ۥۡۨۢ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "LYue/\u06e5\u06e1\u06e8\u06e2<",
        "Landroid/view/MenuItem;",
        ">;"
    }
.end annotation


# instance fields
.field public final synthetic ۥ:Landroid/view/Menu;


# direct methods
.method public constructor <init>(Landroid/view/Menu;)V
    .locals 0

    iput-object p1, p0, LYue/ۥۡ۠ۦۦ$ۥ;->ۥ:Landroid/view/Menu;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public iterator()Ljava/util/Iterator;
    .locals 1
    .annotation build LYue/ۥۡۢۥ۠;
    .end annotation

    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/Iterator<",
            "Landroid/view/MenuItem;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, LYue/ۥۡ۠ۦۦ$ۥ;->ۥ:Landroid/view/Menu;

    invoke-static {v0}, LYue/ۥۡ۠ۦۦ;->ۥۣ۟۟۟(Landroid/view/Menu;)Ljava/util/Iterator;

    move-result-object v0

    return-object v0
.end method
