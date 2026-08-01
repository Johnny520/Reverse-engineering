.class public final synthetic Lxhss/ᲁᛳᲇᛶ;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᛱᛱᛲᲇ:Landroid/widget/PopupWindow;

.field public final synthetic ᛳᲁᲇᛸ:Landroid/content/Context;

.field public final synthetic ᛷᛵᛵᲈ:I

.field public final synthetic ᲇᛴᲇᛵ:Ljava/lang/String;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/4 v0, 0x7

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Ljava/lang/String;Landroid/widget/PopupWindow;)V
    .locals 1

    .line 1
    const/4 v0, 0x0

    .line 2
    iput v0, p0, Lxhss/ᲁᛳᲇᛶ;->ᛷᛵᛵᲈ:I

    .line 3
    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    .line 6
    .line 7
    iput-object p1, p0, Lxhss/ᲁᛳᲇᛶ;->ᛳᲁᲇᛸ:Landroid/content/Context;

    .line 8
    .line 9
    iput-object p2, p0, Lxhss/ᲁᛳᲇᛶ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    .line 10
    .line 11
    iput-object p3, p0, Lxhss/ᲁᛳᲇᛶ;->ᛱᛱᛲᲇ:Landroid/widget/PopupWindow;

    .line 12
    .line 13
    return-void
.end method

.method public synthetic constructor <init>(Landroid/widget/PopupWindow;Landroid/content/Context;Ljava/lang/String;)V
    .locals 1

    .line 14
    const/4 v0, 0x1

    iput v0, p0, Lxhss/ᲁᛳᲇᛶ;->ᛷᛵᛵᲈ:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lxhss/ᲁᛳᲇᛶ;->ᛱᛱᛲᲇ:Landroid/widget/PopupWindow;

    iput-object p2, p0, Lxhss/ᲁᛳᲇᛶ;->ᛳᲁᲇᛸ:Landroid/content/Context;

    iput-object p3, p0, Lxhss/ᲁᛳᲇᛶ;->ᲇᛴᲇᛵ:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public final native onClick(Landroid/view/View;)V
.end method
