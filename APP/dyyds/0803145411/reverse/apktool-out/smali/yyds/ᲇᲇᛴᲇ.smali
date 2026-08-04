.class public final synthetic Lyyds/ᲇᲇᛴᲇ;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Lyyds/ᛴᛱᛱᛸ;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x76

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Lyyds/ᛴᛱᛱᛸ;)V
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    iput v0, p0, Lyyds/ᲇᲇᛴᲇ;->ᲀᛲᛳᲀ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lyyds/ᲇᲇᛴᲇ;->ᲇᲈᛵᛷ:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Lyyds/ᲇᲇᛴᲇ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛱᛱᛸ;

    .line 10
    .line 11
    return-void
.end method

.method public synthetic constructor <init>(Lyyds/ᛴᛱᛱᛸ;Landroid/content/Context;I)V
    .locals 0

    .line 12
    iput p3, p0, Lyyds/ᲇᲇᛴᲇ;->ᲀᛲᛳᲀ:I

    iput-object p1, p0, Lyyds/ᲇᲇᛴᲇ;->ᛲᛴᛳᛲ:Lyyds/ᛴᛱᛱᛸ;

    iput-object p2, p0, Lyyds/ᲇᲇᛴᲇ;->ᲇᲈᛵᛷ:Landroid/content/Context;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final native onClick(Landroid/view/View;)V
.end method
