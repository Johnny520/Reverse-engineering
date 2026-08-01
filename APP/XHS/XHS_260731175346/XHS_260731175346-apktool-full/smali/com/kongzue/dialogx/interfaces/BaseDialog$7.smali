.class Lcom/kongzue/dialogx/interfaces/BaseDialog$7;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Lxhss/ᛷᲁᲇᲀ;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;


# direct methods
.method public constructor <init>(Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lcom/kongzue/dialogx/interfaces/BaseDialog$7;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 5
    .line 6
    return-void
.end method


# virtual methods
.method public final ᛷᛵᛵᲈ(Lxhss/ᛴᛷᲀᲁ;Lxhss/ᲈᲀᛵᛸ;)V
    .locals 0

    .line 1
    sget-object p1, Lxhss/ᲈᲀᛵᛸ;->ON_DESTROY:Lxhss/ᲈᲀᛵᛸ;

    .line 2
    .line 3
    if-ne p2, p1, :cond_0

    .line 4
    .line 5
    iget-object p0, p0, Lcom/kongzue/dialogx/interfaces/BaseDialog$7;->ᛱᛱᛲᲇ:Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;

    .line 6
    .line 7
    invoke-virtual {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᛳᲈᲈᛲ()Landroid/app/Activity;

    .line 8
    .line 9
    .line 10
    move-result-object p0

    .line 11
    invoke-static {p0}, Lcom/kongzue/dialogx/interfaces/ᛷᛵᛵᲈ;->ᲁᲁᛴᲁ(Landroid/app/Activity;)V

    .line 12
    .line 13
    .line 14
    :cond_0
    return-void
.end method
