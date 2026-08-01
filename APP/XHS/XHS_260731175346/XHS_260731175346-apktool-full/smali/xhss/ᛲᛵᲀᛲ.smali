.class public final synthetic Lxhss/ᛲᛵᲀᛲ;
.super Ljava/lang/Object;
.source "r8-map-id-684deb5fba33a691397d1324861b0a91cfdff049bb058f400176b68a1f4afccc"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:Lxhss/ᛴᲈᛴᛲ;

.field public final synthetic ᛳᲁᲇᛸ:I

.field public final synthetic ᲇᛴᲇᛵ:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(Lxhss/ᛴᲈᛴᛲ;ILjava/lang/Object;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lxhss/ᛲᛵᲀᛲ;->ᛱᛱᛲᲇ:Lxhss/ᛴᲈᛴᛲ;

    .line 5
    .line 6
    iput p2, p0, Lxhss/ᛲᛵᲀᛲ;->ᛳᲁᲇᛸ:I

    .line 7
    .line 8
    iput-object p3, p0, Lxhss/ᛲᛵᲀᛲ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final run()V
    .locals 2

    .line 1
    iget-object v0, p0, Lxhss/ᛲᛵᲀᛲ;->ᲇᛴᲇᛵ:Ljava/lang/Object;

    .line 2
    .line 3
    iget-object v1, p0, Lxhss/ᛲᛵᲀᛲ;->ᛱᛱᛲᲇ:Lxhss/ᛴᲈᛴᛲ;

    .line 4
    .line 5
    iget-object v1, v1, Lxhss/ᛴᲈᛴᛲ;->ᛱᛱᛲᲇ:Lxhss/ᛸᲈᛷ;

    .line 6
    .line 7
    iget p0, p0, Lxhss/ᛲᛵᲀᛲ;->ᛳᲁᲇᛸ:I

    .line 8
    .line 9
    invoke-interface {v1, p0, v0}, Lxhss/ᛸᲈᛷ;->ᛷᛴᛷᛱ(ILjava/lang/Object;)V

    .line 10
    .line 11
    .line 12
    return-void
.end method
