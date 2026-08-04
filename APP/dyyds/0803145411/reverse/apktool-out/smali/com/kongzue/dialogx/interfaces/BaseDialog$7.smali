.class Lcom/kongzue/dialogx/interfaces/BaseDialog$7;
.super Ljava/lang/Object;
.source "r8-map-id-23a4d667e3e8d63d05148f8952801ca86a273fc20b9c1ee5b7e6466f054ed4c9"

# interfaces
.implements Lyyds/ᛳᛸᛸᛶ;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;


# direct methods
.method public constructor <init>(Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/kongzue/dialogx/interfaces/BaseDialog$7;->ᲀᛲᛳᲀ:Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᲇᲈᛵᛷ(Lyyds/ᲁᲇᛴᲀ;Lyyds/ᛳᛷᛵᛷ;)V
    .locals 0

    .line 1
    sget-object p1, Lyyds/ᛳᛷᛵᛷ;->ON_DESTROY:Lyyds/ᛳᛷᛵᛷ;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/kongzue/dialogx/interfaces/BaseDialog$7;->ᲀᛲᛳᲀ:Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᛶᛳᛶᛵ()Landroid/app/Activity;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛲᲈᲁ;->ᲀᛲᛱᛱ(Landroid/app/Activity;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
