.class public Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟۟;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Landroidx/appcompat/view/menu/ۥ۟;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x9
    name = "\u06e5\u06df\u06df\u06df"
.end annotation


# instance fields
.field public final ۥ:LYue/ۥۡ۠ۦۨ;

.field public final ۥ۟:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

.field public final ۥ۟۟:I


# direct methods
.method public constructor <init>(LYue/ۥۡ۠ۦۨ;Landroidx/appcompat/view/menu/ۥ۟۟۟۟;I)V
    .locals 0
    .param p1    # LYue/ۥۡ۠ۦۨ;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param
    .param p2    # Landroidx/appcompat/view/menu/ۥ۟۟۟۟;
        .annotation build LYue/ۥۣۡۢۤ;
        .end annotation
    .end param

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟۟;->ۥ:LYue/ۥۡ۠ۦۨ;

    iput-object p2, p0, Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟۟;->ۥ۟:Landroidx/appcompat/view/menu/ۥ۟۟۟۟;

    iput p3, p0, Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟۟;->ۥ۟۟:I

    return-void
.end method


# virtual methods
.method public ۥ()Landroid/widget/ListView;
    .locals 1

    iget-object v0, p0, Landroidx/appcompat/view/menu/ۥ۟$ۥ۟۟۟;->ۥ:LYue/ۥۡ۠ۦۨ;

    invoke-virtual {v0}, LYue/ۥ۠ۧۢۤ;->ۥ۟۟۟ۢ()Landroid/widget/ListView;

    move-result-object v0

    return-object v0
.end method
