.class public LYue/ۥ۟ۡۡۥ$ۥ;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build LYue/ۥۡۦۥۣ;
    api = 0x1a
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = LYue/ۥ۟ۡۡۥ;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x1
    name = "\u06e5"
.end annotation


# instance fields
.field public final synthetic ۥ:LYue/ۥ۟ۡۡۥ;


# direct methods
.method public constructor <init>(LYue/ۥ۟ۡۡۥ;)V
    .locals 0
    .annotation system Ldalvik/annotation/MethodParameters;
        accessFlags = {
            0x8010
        }
        names = {
            null
        }
    .end annotation

    iput-object p1, p0, LYue/ۥ۟ۡۡۥ$ۥ;->ۥ:LYue/ۥ۟ۡۡۥ;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public ۥ()Landroid/view/textclassifier/TextClassifier;
    .locals 1
    .annotation build LYue/ۥۡۢۧ۠;
    .end annotation

    iget-object v0, p0, LYue/ۥ۟ۡۡۥ$ۥ;->ۥ:LYue/ۥ۟ۡۡۥ;

    invoke-static {v0}, LYue/ۥ۟ۡۡۥ;->access$001(LYue/ۥ۟ۡۡۥ;)Landroid/view/textclassifier/TextClassifier;

    move-result-object v0

    return-object v0
.end method

.method public ۥ۟(Landroid/view/textclassifier/TextClassifier;)V
    .locals 1

    iget-object v0, p0, LYue/ۥ۟ۡۡۥ$ۥ;->ۥ:LYue/ۥ۟ۡۡۥ;

    invoke-static {v0, p1}, LYue/ۥ۟ۡۡۥ;->access$101(LYue/ۥ۟ۡۡۥ;Landroid/view/textclassifier/TextClassifier;)V

    return-void
.end method
