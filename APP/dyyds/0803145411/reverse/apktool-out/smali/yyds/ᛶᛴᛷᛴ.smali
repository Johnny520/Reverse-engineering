.class public final synthetic Lyyds/ᛶᛴᛷᛴ;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic ᲀᛲᛳᲀ:I

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᲁᛶᲁᲀ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0xa2

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(ILyyds/ᲁᛶᲁᲀ;)V
    .locals 0

    .line 1
    iput p1, p0, Lyyds/ᛶᛴᛷᛴ;->ᲀᛲᛳᲀ:I

    .line 2
    .line 3
    iput-object p2, p0, Lyyds/ᛶᛴᛷᛴ;->ᲇᲈᛵᛷ:Lyyds/ᲁᛶᲁᲀ;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final native onDismiss(Landroid/content/DialogInterface;)V
.end method
