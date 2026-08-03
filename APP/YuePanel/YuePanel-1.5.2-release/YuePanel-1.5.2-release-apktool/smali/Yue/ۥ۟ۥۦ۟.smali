.class public final synthetic LYue/ۥ۟ۥۦ۟;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/kongzue/dialogx/interfaces/OnMenuItemClickListener;


# instance fields
.field public final synthetic ۥ:LYue/ۥ۟ۥۤۧ;

.field public final synthetic ۥ۟:I

.field public final synthetic ۥ۟۟:Lcom/yuexin/panel/utils/entity/comment/CommentBean;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x1e3

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥ۟ۥۤۧ;ILcom/yuexin/panel/utils/entity/comment/CommentBean;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟ۥۦ۟;->ۥ:LYue/ۥ۟ۥۤۧ;

    iput p2, p0, LYue/ۥ۟ۥۦ۟;->ۥ۟:I

    iput-object p3, p0, LYue/ۥ۟ۥۦ۟;->ۥ۟۟:Lcom/yuexin/panel/utils/entity/comment/CommentBean;

    return-void
.end method


# virtual methods
.method public final native onClick(Ljava/lang/Object;Ljava/lang/CharSequence;I)Z
.end method
