.class public final synthetic Lyyds/ᲁᛱᲀᛸ;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Landroid/widget/TextView;

.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Landroid/content/Context;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x6e

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Landroid/content/Context;Landroid/widget/TextView;I)V
    .locals 0

    .line 1
    iput p3, p0, Lyyds/ᲁᛱᲀᛸ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p1, p0, Lyyds/ᲁᛱᲀᛸ;->ᲇᲈᛵᛷ:Landroid/content/Context;

    .line 4
    .line 5
    iput-object p2, p0, Lyyds/ᲁᛱᲀᛸ;->ᛲᛴᛳᛲ:Landroid/widget/TextView;

    .line 6
    .line 7
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 8
    .line 9
    .line 10
    return-void
.end method


# virtual methods
.method public final native onClick(Landroid/view/View;)V
.end method
