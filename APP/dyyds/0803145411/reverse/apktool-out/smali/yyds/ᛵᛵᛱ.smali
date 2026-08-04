.class public final synthetic Lyyds/ᛵᛵᛱ;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/content/DialogInterface$OnDismissListener;


# instance fields
.field public final synthetic ᛲᛴᛳᛲ:Lyyds/ᛴᲁᛱᲇ;

.field public final synthetic ᲀᛲᛳᲀ:Lyyds/ᛶᲀᲈᛷ;

.field public final synthetic ᲇᲇᲇᛱ:Landroid/os/Handler;

.field public final synthetic ᲇᲈᛵᛷ:Lyyds/ᛴᲁᛱᲇ;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x2f

    invoke-static {v0}, Lcom/android/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(Lyyds/ᛶᲀᲈᛷ;Lyyds/ᛴᲁᛱᲇ;Lyyds/ᛴᲁᛱᲇ;Landroid/os/Handler;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lyyds/ᛵᛵᛱ;->ᲀᛲᛳᲀ:Lyyds/ᛶᲀᲈᛷ;

    .line 5
    .line 6
    iput-object p2, p0, Lyyds/ᛵᛵᛱ;->ᲇᲈᛵᛷ:Lyyds/ᛴᲁᛱᲇ;

    .line 7
    .line 8
    iput-object p3, p0, Lyyds/ᛵᛵᛱ;->ᛲᛴᛳᛲ:Lyyds/ᛴᲁᛱᲇ;

    .line 9
    .line 10
    iput-object p4, p0, Lyyds/ᛵᛵᛱ;->ᲇᲇᲇᛱ:Landroid/os/Handler;

    .line 11
    .line 12
    return-void
.end method


# virtual methods
.method public final native onDismiss(Landroid/content/DialogInterface;)V
.end method
