.class public final synthetic Lma0;
.super Ljava/lang/Object;
.source "r8-map-id-488ec55e75035ea6264aa11562025c0c7e4383a531b08db4ba106b7248a106ee"

# interfaces
.implements Landroid/view/View$OnClickListener;


# instance fields
.field public final synthetic ε:I

.field public final synthetic ζ:Landroid/app/Activity;


# direct methods
.method public synthetic constructor <init>(Landroid/app/Activity;I)V
    .locals 0

    .line 1
    iput p2, p0, Lma0;->ε:I

    .line 2
    .line 3
    iput-object p1, p0, Lma0;->ζ:Landroid/app/Activity;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final onClick(Landroid/view/View;)V
    .locals 7

    .line 1
    iget p1, p0, Lma0;->ε:I

    .line 2
    .line 3
    const/4 v0, 0x1

    .line 4
    const/4 v1, 0x0

    .line 5
    iget-object p0, p0, Lma0;->ζ:Landroid/app/Activity;

    .line 6
    .line 7
    packed-switch p1, :pswitch_data_0

    .line 8
    .line 9
    .line 10
    new-instance p1, Landroid/app/AlertDialog$Builder;

    .line 11
    .line 12
    invoke-direct {p1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V

    .line 13
    .line 14
    .line 15
    const-string p0, "\u4eba\u5458\u7eed\u706b\u4e0e\u706b\u661f\u4efb\u52a1\u6559\u7a0b"

    .line 16
    .line 17
    invoke-virtual {p1, p0}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 18
    .line 19
    .line 20
    move-result-object p0

    .line 21
    const-string p1, "\u4eba\u5458\u7eed\u706b\u4e0e\u5c0f\u706b\u4eba\u8bbe\u7f6e\u8bf4\u660e\n\n1. \u5165\u53e3\n\u5728\u81ea\u5b9a\u4e49\u7eed\u706b\u4eba\u5458\u9875\u9762\u70b9\u51fb\u67d0\u4e2a\u4eba\u5458\uff0c\u4f1a\u6253\u5f00\u5f53\u524d\u201c\u7eed\u706b\u4e0e\u706b\u661f\u4efb\u52a1\u201d\u5f39\u7a97\u3002\n\n2. \u6d88\u606f\u6765\u6e90\n\u8ddf\u968f\u5168\u5c40\uff1a\u4e0d\u4e3a\u8be5\u4eba\u5458\u5355\u72ec\u6307\u5b9a\u5185\u5bb9\u3002\u53d1\u9001\u7eed\u706b\u6d88\u606f\u65f6\u4f1a\u7ee7\u7eed\u4f7f\u7528\u5206\u7ec4\u914d\u7f6e\uff1b\u5982\u679c\u6ca1\u6709\u5206\u7ec4\u914d\u7f6e\uff0c\u518d\u4f7f\u7528\u5168\u5c40\u914d\u7f6e\u3002\n\u56fa\u5b9a\u6587\u672c\uff1a\u53ea\u7ed9\u8be5\u4eba\u5458\u4f7f\u7528\u8f93\u5165\u6846\u91cc\u7684\u6587\u5b57\u3002\u4fdd\u5b58\u65f6\u56fa\u5b9a\u6587\u672c\u4e0d\u80fd\u4e3a\u7a7a\uff0c\u6700\u591a\u4fdd\u5b58 80 \u4e2a\u5b57\u7b26\u3002\n\u4e00\u8a00\uff1a\u7ed9\u8be5\u4eba\u5458\u53d1\u9001\u65f6\u4ece\u4e00\u8a00\u63a5\u53e3\u83b7\u53d6\u4e00\u53e5\u8bdd\u3002\n\u4eca\u65e5\u8bd7\u8bcd\uff1a\u7ed9\u8be5\u4eba\u5458\u53d1\u9001\u65f6\u4ece\u4eca\u65e5\u8bd7\u8bcd\u63a5\u53e3\u83b7\u53d6\u8bd7\u53e5\u3002\n\n3. \u8f93\u5165\u6846\n\u53ea\u6709\u9009\u62e9\u201c\u56fa\u5b9a\u6587\u672c\u201d\u65f6\uff0c\u8f93\u5165\u6846\u5185\u5bb9\u624d\u4f1a\u4f5c\u4e3a\u8be5\u4eba\u5458\u7684\u4e13\u5c5e\u7eed\u706b\u6587\u6848\u4fdd\u5b58\u3002\n\u70b9\u51fb\u201c\u8f93\u5165\u8be5\u4eba\u5458\u4e13\u5c5e\u56fa\u5b9a\u6587\u672c\u201d\u8f93\u5165\u6846\u540e\u4f1a\u81ea\u52a8\u83b7\u53d6\u7126\u70b9\u5e76\u5f39\u51fa\u952e\u76d8\uff1b\u5982\u679c\u952e\u76d8\u88ab\u5bbf\u4e3b App \u62e6\u622a\uff0c\u53ef\u518d\u6b21\u70b9\u51fb\u8f93\u5165\u6846\u3002\n\n4. \u4e2a\u4eba\u7eed\u706b\u89c4\u5219\n\u8ddf\u968f\u9ed8\u8ba4\u89c4\u5219\uff1a\u8be5\u4eba\u5458\u662f\u5426\u53c2\u4e0e\u7eed\u706b\u7531\u5168\u5c40\u5f00\u5173\u3001\u5206\u7ec4\u89c4\u5219\u548c\u5f85\u7eed\u72b6\u6001\u51b3\u5b9a\u3002\n\u52a0\u5165\u81ea\u5b9a\u4e49\u7eed\u706b\uff1a\u5373\u4f7f\u5168\u5c40\u81ea\u5b9a\u4e49\u4eba\u5458\u7eed\u706b\u5217\u8868\u4e2d\u539f\u672c\u6ca1\u6709\u8be5\u4eba\u5458\uff0c\u4e5f\u4f1a\u628a\u4ed6\u7eb3\u5165\u81ea\u5b9a\u4e49\u7eed\u706b\u76ee\u6807\u3002\n\u81ea\u5b9a\u4e49\u7eed\u706b\u65f6\u6392\u9664\uff1a\u5f53\u6267\u884c\u81ea\u5b9a\u4e49\u7eed\u706b\u65f6\uff0c\u660e\u786e\u8df3\u8fc7\u8be5\u4eba\u5458\u3002\n\n5. \u4fdd\u5b58\u4e0e\u6e05\u9664\n\u70b9\u51fb\u201c\u4fdd\u5b58\u201d\u4f1a\u540c\u65f6\u4fdd\u5b58\u6d88\u606f\u6765\u6e90\u3001\u56fa\u5b9a\u6587\u672c\u3001\u4e2a\u4eba\u7eed\u706b\u89c4\u5219\u3001\u706b\u661f\u4efb\u52a1\u3001\u81ea\u52a8\u6295\u5582\u548c\u8425\u5730\u52a8\u4f5c\u8986\u76d6\u9879\u3002\n\u70b9\u51fb\u201c\u6e05\u9664\u201d\u4f1a\u5220\u9664\u8be5\u4eba\u5458\u7684\u4e13\u5c5e\u914d\u7f6e\uff0c\u5e76\u628a\u7eed\u706b\u3001\u706b\u661f\u4efb\u52a1\u3001\u81ea\u52a8\u6295\u5582\u4e0e\u8425\u5730\u52a8\u4f5c\u6062\u590d\u4e3a\u8ddf\u968f\u5206\u7ec4\u6216\u5168\u5c40\u3002\n\u70b9\u51fb\u201c\u53d6\u6d88\u201d\u4e0d\u4f1a\u4fdd\u5b58\u672c\u6b21\u4fee\u6539\u3002\n\n6. \u6d4b\u8bd5\u53d1\u9001\u7eed\u706b\u6d88\u606f\n\u201c\u6d4b\u8bd5\u53d1\u9001\u7eed\u706b\u6d88\u606f\u201d\u4f1a\u7acb\u523b\u6309\u5f53\u524d\u5f39\u7a97\u91cc\u7684\u9009\u62e9\u751f\u6210\u4e00\u6b21\u6d88\u606f\u5e76\u5c1d\u8bd5\u53d1\u9001\u7ed9\u8be5\u4eba\u5458\u3002\n\u6d4b\u8bd5\u53d1\u9001\u7528\u4e8e\u9a8c\u8bc1\u5185\u5bb9\u548c\u53d1\u9001\u94fe\u8def\uff0c\u4e0d\u7b49\u540c\u4e8e\u4fdd\u5b58\uff1b\u6d4b\u8bd5\u524d\u672a\u4fdd\u5b58\u7684\u5185\u5bb9\u53ea\u5728\u672c\u6b21\u6d4b\u8bd5\u4e2d\u4e34\u65f6\u751f\u6548\u3002\n\u5982\u679c\u53d1\u9001\u80fd\u529b\u672a\u6fc0\u6d3b\uff0c\u9700\u8981\u5148\u5728\u804a\u5929\u91cc\u624b\u52a8\u53d1\u9001\u4e00\u6761\u6d88\u606f\uff0c\u8ba9\u6a21\u5757\u6355\u83b7\u53d1\u9001\u5165\u53e3\u3002\n\n7. \u5b8c\u6210\u706b\u661f\u4efb\u52a1\n\u201c\u5b8c\u6210\u706b\u661f\u4efb\u52a1\u201d\u53ea\u5904\u7406\u5f53\u524d\u5f39\u7a97\u5bf9\u5e94\u7684\u4eba\u5458\uff0c\u4e0d\u4f1a\u904d\u5386\u6216\u89e6\u53d1\u5176\u4ed6\u4eba\u5458\u3002\n\u6267\u884c\u65f6\u91c7\u7528\u5f39\u7a97\u5f53\u524d\u9009\u62e9\u7684\u201c\u53c2\u4e0e\u6bcf\u65e5\u706b\u661f\u4efb\u52a1\u201d\u201c\u81ea\u52a8\u5b8c\u6210\u4e92\u53d1\u6d88\u606f\u201d\u201c\u81ea\u52a8\u53d1\u9001\u4efb\u52a1\u56fe\u7247\u201d\u548c\u4e92\u53d1\u6d88\u606f\u5185\u5bb9\uff1b\u5373\u4f7f\u5c1a\u672a\u70b9\u51fb\u4fdd\u5b58\uff0c\u672c\u6b21\u6267\u884c\u4e5f\u4f1a\u4e34\u65f6\u91c7\u7528\u8fd9\u4e9b\u9009\u62e9\u3002\n\u4e92\u53d1\u6d88\u606f\u5185\u5bb9\u7559\u7a7a\u65f6\u5148\u8ddf\u968f\u5206\u7ec4\u4efb\u52a1\u6587\u672c\uff0c\u518d\u8ddf\u968f\u8bbe\u7f6e\u9875\u4e2d\u7684\u5168\u5c40\u9ed8\u8ba4\u5185\u5bb9\uff1b\u56fe\u7247\u4efb\u52a1\u4f7f\u7528\u5206\u7ec4\u6216\u8bbe\u7f6e\u9875\u9009\u62e9\u7684\u89c4\u5219\u3002\n\u6267\u884c\u8fc7\u7a0b\u4f1a\u663e\u793a\u9876\u90e8\u8fdb\u5ea6\u901a\u77e5\uff0c\u5e76\u4f9d\u6b21\u8bfb\u53d6\u8be5\u4eba\u5458\u4efb\u52a1\u3001\u63d0\u4ea4\u5141\u8bb8\u7684\u6d88\u606f\u6216\u56fe\u7247\uff0c\u6700\u540e\u68c0\u67e5\u5e76\u9886\u53d6\u53ef\u9886\u53d6\u5956\u52b1\u3002\n\u82e5\u8be5\u4eba\u5458\u88ab\u8bbe\u4e3a\u4e0d\u53c2\u4e0e\u3001\u6ca1\u6709\u7b26\u5408\u6761\u4ef6\u7684\u4efb\u52a1\u3001\u53d1\u9001\u80fd\u529b\u5c1a\u672a\u6fc0\u6d3b\u6216\u5df2\u6709\u706b\u661f\u4efb\u52a1\u6b63\u5728\u8fd0\u884c\uff0c\u7ed3\u679c\u5f39\u7a97\u4f1a\u7ed9\u51fa\u76f8\u5e94\u8bf4\u660e\u3002\n\n8. \u81ea\u52a8\u6295\u5582\n\u201c\u81ea\u52a8\u6295\u5582\u5c0f\u706b\u4eba\u201d\u53ef\u8bbe\u7f6e\u4e3a\u8ddf\u968f\u5206\u7ec4/\u5168\u5c40\u3001\u5f00\u542f\u6216\u5173\u95ed\uff1b\u5168\u5c40\u603b\u5f00\u5173\u5173\u95ed\u65f6\u4e0d\u4f1a\u81ea\u52a8\u6295\u5582\u4efb\u4f55\u4eba\u5458\u3002\n\u201c\u6295\u5582\u98df\u7269\u201d\u53ef\u8ddf\u968f\u5206\u7ec4/\u8bbe\u7f6e\u9875\u9ed8\u8ba4\u503c\uff0c\u4e5f\u53ef\u4e3a\u5f53\u524d\u4eba\u5458\u5355\u72ec\u9009\u62e9\u3002\u7f13\u5b58\u4ef7\u683c\u53ea\u7528\u4e8e\u5c55\u793a\uff0c\u5b9e\u9645\u6295\u5582\u524d\u4ecd\u4f1a\u8bfb\u53d6\u8be5\u4f1a\u8bdd\u5b9e\u65f6\u76ee\u5f55\u5e76\u6267\u884c\u8bbe\u7f6e\u9875\u7684\u4ef7\u683c\u4e0a\u9650\u3002\n\u201c\u66f4\u65b0\u8be5\u4eba\u5458\u98df\u7269\u5217\u8868\u201d\u4f1a\u4f18\u5148\u4f7f\u7528\u5f53\u524d\u4f1a\u8bdd\u5237\u65b0\u76ee\u5f55\uff0c\u4e0d\u4f1a\u6267\u884c\u6295\u5582\u3002\n\n9. \u8425\u5730\u52a8\u4f5c\n\u8425\u5730\u81ea\u52a8\u6536\u83b7\u3001\u81ea\u52a8\u79cd\u690d\u548c\u81ea\u52a8\u6d47\u6c34\u5747\u53ef\u8bbe\u7f6e\u4e3a\u8ddf\u968f\u5206\u7ec4/\u5168\u5c40\u3001\u5f00\u542f\u6216\u5173\u95ed\u3002\n\u8425\u5730\u79cd\u5b50\u7b56\u7565\u548c\u667a\u80fd\u79cd\u5b50\u6392\u9664\u540d\u5355\u4ecd\u5728\u8425\u5730\u7ba1\u7406\u9875\u9762\u6309\u4eba\u5458\u6216\u5168\u5c40\u8bbe\u7f6e\uff1b\u4e2a\u4eba\u8425\u5730\u52a8\u4f5c\u8986\u76d6\u4e0d\u4f1a\u4fee\u6539\u8fd9\u4e9b\u7ec6\u7c92\u5ea6\u914d\u7f6e\u3002\n\n10. \u4f2a\u88c5\u706b\u82b1\u5929\u6570\n\u5f00\u542f\u8bbe\u7f6e\u9875\u91cc\u7684\u201c\u4f2a\u88c5\u706b\u82b1\u5929\u6570\u201d\u540e\uff0c\u53ef\u5728\u672c\u5f39\u7a97\u8f93\u5165 1~9999 \u7684\u5929\u6570\u3002\n\u7559\u7a7a\u8868\u793a\u4e0d\u4f2a\u88c5\u8be5\u4eba\u5458\u3002\u8be5\u529f\u80fd\u53ea\u6539\u672c\u5730\u5c55\u793a\u7528\u7684\u706b\u82b1\u6570\u636e\uff0c\u4e0d\u4f1a\u6539\u53d8\u670d\u52a1\u7aef\u771f\u5b9e\u5929\u6570\u3002\n\u4fdd\u5b58\u6216\u6e05\u9664\u540e\uff0c\u5efa\u8bae\u8fd4\u56de\u6d88\u606f\u5217\u8868\u91cd\u65b0\u8fdb\u5165\uff0c\u8ba9\u4f1a\u8bdd\u6570\u636e\u91cd\u65b0\u5237\u65b0\u3002\n\n11. \u4f18\u5148\u7ea7\n\u4eba\u5458\u4e13\u5c5e\u914d\u7f6e\u4f18\u5148\u7ea7\u6700\u9ad8\u3002\n\u6ca1\u6709\u4eba\u5458\u4e13\u5c5e\u914d\u7f6e\u65f6\u4f7f\u7528\u4eba\u5458\u6240\u5728\u5206\u7ec4\u914d\u7f6e\u3002\n\u6ca1\u6709\u5206\u7ec4\u914d\u7f6e\u65f6\u4f7f\u7528\u5168\u5c40\u706b\u82b1\u7eed\u671f\u914d\u7f6e\u3002\nAPI \u83b7\u53d6\u5931\u8d25\u65f6\u4f1a\u56de\u9000\u5230\u5168\u5c40\u56fa\u5b9a\u6587\u672c\uff0c\u907f\u514d\u7eed\u706b\u6d88\u606f\u4e3a\u7a7a\u3002\n\n\u706b\u661f\u4e92\u53d1\u4efb\u52a1\u6d88\u606f\u4e0e\u7eed\u706b\u6d88\u606f\u76f8\u4e92\u72ec\u7acb\uff1a\u4eba\u5458\u672a\u8bbe\u7f6e\u4e13\u5c5e\u4efb\u52a1\u6d88\u606f\u65f6\u5148\u8ddf\u968f\u5206\u7ec4\uff0c\u518d\u8ddf\u968f\u706b\u661f\u4efb\u52a1\u5168\u5c40\u9ed8\u8ba4\u5185\u5bb9\u3002\n\n12. \u5e38\u89c1\u95ee\u9898\n\u5982\u679c\u9009\u62e9\u56fa\u5b9a\u6587\u672c\u4f46\u7559\u7a7a\uff0c\u4fdd\u5b58\u4f1a\u88ab\u62d2\u7edd\u3002\n\u5982\u679c\u9009\u62e9\u4e00\u8a00\u6216\u4eca\u65e5\u8bd7\u8bcd\uff0c\u8f93\u5165\u6846\u91cc\u7684\u6587\u5b57\u4e0d\u4f1a\u53c2\u4e0e\u53d1\u9001\u3002\n\u5982\u679c\u5bf9\u540c\u4e00\u4eba\u5458\u540c\u65f6\u914d\u7f6e\u4e86\u5206\u7ec4\u89c4\u5219\u548c\u4e2a\u4eba\u89c4\u5219\uff0c\u4e2a\u4eba\u89c4\u5219\u8986\u76d6\u5206\u7ec4\u89c4\u5219\u3002"

    .line 22
    .line 23
    invoke-virtual {p0, p1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;

    .line 24
    .line 25
    .line 26
    move-result-object p0

    .line 27
    const-string p1, "\u77e5\u9053\u4e86"

    .line 28
    .line 29
    invoke-virtual {p0, p1, v1}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;

    .line 30
    .line 31
    .line 32
    move-result-object p0

    .line 33
    invoke-virtual {p0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;

    .line 34
    .line 35
    .line 36
    return-void

    .line 37
    :pswitch_0
    sget-object p1, Lbv1;->α:Lbv1;

    .line 38
    .line 39
    const/4 p1, 0x0

    .line 40
    :try_start_0
    invoke-static {v1, v0, v1}, Lux;->Ε(Ljava/lang/String;ILjava/lang/Object;)Ljava/util/List;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-interface {v0}, Ljava/util/List;->isEmpty()Z

    .line 45
    .line 46
    .line 47
    move-result v1

    .line 48
    if-eqz v1, :cond_0

    .line 49
    .line 50
    const-string v0, "\u6ca1\u6709\u53ef\u5bfc\u51fa\u7684\u65e5\u5fd7"

    .line 51
    .line 52
    invoke-static {p0, v0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 53
    .line 54
    .line 55
    move-result-object v0

    .line 56
    invoke-virtual {v0}, Landroid/widget/Toast;->show()V

    .line 57
    .line 58
    .line 59
    goto/16 :goto_2

    .line 60
    .line 61
    :catchall_0
    move-exception v0

    .line 62
    goto/16 :goto_1

    .line 63
    .line 64
    :cond_0
    new-instance v1, Ljava/lang/StringBuilder;

    .line 65
    .line 66
    invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V

    .line 67
    .line 68
    .line 69
    invoke-interface {v0}, Ljava/util/List;->size()I

    .line 70
    .line 71
    .line 72
    move-result v2

    .line 73
    invoke-static {p0, v2}, Lbv1;->ο(Landroid/app/Activity;I)Ljava/lang/String;

    .line 74
    .line 75
    .line 76
    move-result-object v2

    .line 77
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 78
    .line 79
    .line 80
    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    .line 81
    .line 82
    .line 83
    move-result-object v0

    .line 84
    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    .line 85
    .line 86
    .line 87
    move-result v2

    .line 88
    if-eqz v2, :cond_1

    .line 89
    .line 90
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 91
    .line 92
    .line 93
    move-result-object v2

    .line 94
    check-cast v2, Lux$α;

    .line 95
    .line 96
    invoke-static {v2}, Lux;->ξ(Lux$α;)Ljava/lang/String;

    .line 97
    .line 98
    .line 99
    move-result-object v2

    .line 100
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 101
    .line 102
    .line 103
    const-string v2, "\n\n"

    .line 104
    .line 105
    invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 106
    .line 107
    .line 108
    goto :goto_0

    .line 109
    :cond_1
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    new-instance v1, Landroid/content/Intent;

    .line 114
    .line 115
    const-string v2, "android.intent.action.CREATE_DOCUMENT"

    .line 116
    .line 117
    invoke-direct {v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V

    .line 118
    .line 119
    .line 120
    const-string v2, "android.intent.category.OPENABLE"

    .line 121
    .line 122
    invoke-virtual {v1, v2}, Landroid/content/Intent;->addCategory(Ljava/lang/String;)Landroid/content/Intent;

    .line 123
    .line 124
    .line 125
    const-string v2, "text/plain"

    .line 126
    .line 127
    invoke-virtual {v1, v2}, Landroid/content/Intent;->setType(Ljava/lang/String;)Landroid/content/Intent;

    .line 128
    .line 129
    .line 130
    const-string v2, "android.intent.extra.TITLE"

    .line 131
    .line 132
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 133
    .line 134
    .line 135
    move-result-wide v3

    .line 136
    new-instance v5, Ljava/lang/StringBuilder;

    .line 137
    .line 138
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 139
    .line 140
    .line 141
    const-string v6, "dylog_"

    .line 142
    .line 143
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 144
    .line 145
    .line 146
    invoke-virtual {v5, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 147
    .line 148
    .line 149
    const-string v3, ".txt"

    .line 150
    .line 151
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v3

    .line 158
    invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;

    .line 159
    .line 160
    .line 161
    new-instance v2, Lju1;

    .line 162
    .line 163
    invoke-direct {v2}, Landroid/app/Fragment;-><init>()V

    .line 164
    .line 165
    .line 166
    iput-object v0, v2, Lju1;->ε:Ljava/lang/String;

    .line 167
    .line 168
    new-instance v0, Lit1;

    .line 169
    .line 170
    const/4 v3, 0x5

    .line 171
    invoke-direct {v0, p0, v3}, Lit1;-><init>(Landroid/app/Activity;I)V

    .line 172
    .line 173
    .line 174
    iput-object v0, v2, Lju1;->ζ:Lit1;

    .line 175
    .line 176
    invoke-virtual {p0}, Landroid/app/Activity;->getFragmentManager()Landroid/app/FragmentManager;

    .line 177
    .line 178
    .line 179
    move-result-object v0

    .line 180
    invoke-virtual {v0}, Landroid/app/FragmentManager;->beginTransaction()Landroid/app/FragmentTransaction;

    .line 181
    .line 182
    .line 183
    move-result-object v0

    .line 184
    const-string v3, "export_log_fragment"

    .line 185
    .line 186
    invoke-virtual {v0, v2, v3}, Landroid/app/FragmentTransaction;->add(Landroid/app/Fragment;Ljava/lang/String;)Landroid/app/FragmentTransaction;

    .line 187
    .line 188
    .line 189
    move-result-object v0

    .line 190
    invoke-virtual {v0}, Landroid/app/FragmentTransaction;->commitAllowingStateLoss()I

    .line 191
    .line 192
    .line 193
    new-instance v0, Landroid/os/Handler;

    .line 194
    .line 195
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 196
    .line 197
    .line 198
    move-result-object v3

    .line 199
    invoke-direct {v0, v3}, Landroid/os/Handler;-><init>(Landroid/os/Looper;)V

    .line 200
    .line 201
    .line 202
    new-instance v3, Lii0;

    .line 203
    .line 204
    const/16 v4, 0x17

    .line 205
    .line 206
    invoke-direct {v3, v2, v4, v1}, Lii0;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 207
    .line 208
    .line 209
    const-wide/16 v1, 0x64

    .line 210
    .line 211
    invoke-virtual {v0, v3, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 212
    .line 213
    .line 214
    goto :goto_2

    .line 215
    :goto_1
    const-string v1, "DYHelper"

    .line 216
    .line 217
    const-string v2, "\u5bfc\u51fa\u65e5\u5fd7\u5931\u8d25"

    .line 218
    .line 219
    invoke-static {v1, v2, v0}, Lux;->ι(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 220
    .line 221
    .line 222
    invoke-virtual {v0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    .line 223
    .line 224
    .line 225
    move-result-object v0

    .line 226
    new-instance v1, Ljava/lang/StringBuilder;

    .line 227
    .line 228
    const-string v2, "\u5bfc\u51fa\u5931\u8d25: "

    .line 229
    .line 230
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 231
    .line 232
    .line 233
    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 234
    .line 235
    .line 236
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 237
    .line 238
    .line 239
    move-result-object v0

    .line 240
    invoke-static {p0, v0, p1}, Landroid/widget/Toast;->makeText(Landroid/content/Context;Ljava/lang/CharSequence;I)Landroid/widget/Toast;

    .line 241
    .line 242
    .line 243
    move-result-object p0

    .line 244
    invoke-virtual {p0}, Landroid/widget/Toast;->show()V

    .line 245
    .line 246
    .line 247
    :goto_2
    return-void

    .line 248
    :pswitch_1
    invoke-static {p0}, Lmi0;->β(Landroid/app/Activity;)V

    .line 249
    .line 250
    .line 251
    return-void

    .line 252
    :pswitch_2
    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 253
    .line 254
    .line 255
    new-instance p1, Lja0;

    .line 256
    .line 257
    invoke-direct {p1, p0, v0}, Lja0;-><init>(Landroid/app/Activity;I)V

    .line 258
    .line 259
    .line 260
    invoke-static {}, Landroid/os/Looper;->myLooper()Landroid/os/Looper;

    .line 261
    .line 262
    .line 263
    move-result-object v0

    .line 264
    invoke-static {}, Landroid/os/Looper;->getMainLooper()Landroid/os/Looper;

    .line 265
    .line 266
    .line 267
    move-result-object v1

    .line 268
    invoke-static {v0, v1}, Lln0;->ι(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 269
    .line 270
    .line 271
    move-result v0

    .line 272
    if-eqz v0, :cond_2

    .line 273
    .line 274
    invoke-virtual {p1}, Lja0;->invoke()Ljava/lang/Object;

    .line 275
    .line 276
    .line 277
    goto :goto_3

    .line 278
    :cond_2
    new-instance v0, Lν;

    .line 279
    .line 280
    const/16 v1, 0x10

    .line 281
    .line 282
    invoke-direct {v0, v1, p1}, Lν;-><init>(ILjava/lang/Object;)V

    .line 283
    .line 284
    .line 285
    invoke-virtual {p0, v0}, Landroid/app/Activity;->runOnUiThread(Ljava/lang/Runnable;)V

    .line 286
    .line 287
    .line 288
    :goto_3
    return-void

    .line 289
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
