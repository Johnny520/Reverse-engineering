.class public final synthetic LYue/ۥ۟ۢۨۥ;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/widget/CompoundButton$OnCheckedChangeListener;


# instance fields
.field public final synthetic ۥ:LYue/ۥ۟ۢۨۦ;

.field public final synthetic ۥ۟:Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkList;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x35f

    invoke-static {v0}, Lcom/nmmedit/protect/NativeUtil;->classesInit0(I)V

    return-void
.end method

.method public synthetic constructor <init>(LYue/ۥ۟ۢۨۦ;Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkList;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LYue/ۥ۟ۢۨۥ;->ۥ:LYue/ۥ۟ۢۨۦ;

    iput-object p2, p0, LYue/ۥ۟ۢۨۥ;->ۥ۟:Lcom/yuexin/panel/utils/entity/bookmark/VideoMarkList;

    return-void
.end method


# virtual methods
.method public final native onCheckedChanged(Landroid/widget/CompoundButton;Z)V
.end method
