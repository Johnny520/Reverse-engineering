.class public final Lxhss/ᛸᛸᲁᲁ;
.super Lxhss/ᛷᛲᛳᛴ;

# interfaces
.implements Lxhss/ᛵᲇᛱᛴ;
.implements Lxhss/ᲀᛸᛳᲈ;


# instance fields
.field public ᛳᲁᲇᛸ:Ljava/lang/Class;

.field public ᛷᛴᛷᛱ:I

.field public synthetic ᛸᛲᲀᛵ:Ljava/lang/Object;

.field public ᛸᛴᛶᛳ:I

.field public final synthetic ᛸᛷᲈᲈ:Ljava/lang/Class;

.field public ᲀᲇᛳᲁ:I

.field public ᲇᛴᲇᛵ:[Ljava/lang/Object;

.field public ᲇᛶᛴᲀ:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x11

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public constructor <init>(Ljava/lang/Class;Lxhss/ᛱᛴᛶᛴ;)V
    .locals 0

    .line 1
    iput-object p1, p0, Lxhss/ᛸᛸᲁᲁ;->ᛸᛷᲈᲈ:Ljava/lang/Class;

    .line 2
    .line 3
    invoke-direct {p0, p2}, Lxhss/ᛷᛲᛳᛴ;-><init>(Lxhss/ᛱᛴᛶᛴ;)V

    .line 4
    .line 5
    .line 6
    if-eqz p2, :cond_1

    .line 7
    .line 8
    invoke-interface {p2}, Lxhss/ᛱᛴᛶᛴ;->ᲇᛶᛴᲀ()Lxhss/ᛴᛵᛳᛵ;

    .line 9
    .line 10
    .line 11
    move-result-object p0

    .line 12
    sget-object p1, Lxhss/ᲇᛷᲁᛷ;->ᛱᛱᛲᲇ:Lxhss/ᲇᛷᲁᛷ;

    .line 13
    .line 14
    if-ne p0, p1, :cond_0

    .line 15
    .line 16
    goto :goto_0

    .line 17
    :cond_0
    const-string p0, "Coroutines with restricted suspension must have EmptyCoroutineContext"

    .line 18
    .line 19
    invoke-static {p0}, Lxhss/ᛵᲈᲁᲈ;->ᲀᲇᛳᲁ(Ljava/lang/String;)V

    .line 20
    .line 21
    .line 22
    const/4 p0, 0x0

    .line 23
    throw p0

    .line 24
    :cond_1
    :goto_0
    return-void
.end method


# virtual methods
.method public final native toString()Ljava/lang/String;
.end method

.method public final native ᛱᛱᛲᲇ()I
.end method

.method public final native ᛳᲁᲇᛸ(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final native ᛸᛲᲀᛵ(Ljava/lang/Object;)Ljava/lang/Object;
.end method

.method public final native ᲀᲇᛳᲁ(Ljava/lang/Object;Lxhss/ᛱᛴᛶᛴ;)Lxhss/ᛱᛴᛶᛴ;
.end method

.method public final native ᲇᛶᛴᲀ()Lxhss/ᛴᛵᛳᛵ;
.end method
